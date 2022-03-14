/*
14/3/2022 : 71. Simplify Path [EXPO 2020 Day 2 - Germany,India,US,Saudi Arabia]
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

The path starts with a single slash '/'.
Any two directories are separated by a single slash '/'.
The path does not end with a trailing '/'.
The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
Return the simplified canonical path.
*/
class FilePathSimplify {
    public String simplifyPath(String path) {
        String[] x = path.split("/");
        StringBuilder sb = new StringBuilder();
        for (int i = x.length - 1, sk = 0; i >= 0; i--) {
            if (x[i].equals(".") || x[i].length() == 0) continue;
            if (x[i].equals("..")) sk++;  // increment skip count 
            else if (sk > 0) sk--;  // skip it
            else sb.insert(0, "/" + x[i]);  // skip = 0? then add it.
        }
        if (sb.length() == 0) sb.append("/");
        return sb.toString();
    }
}
