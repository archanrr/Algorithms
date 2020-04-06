'''
Binary Tree Datastructure
'''
import sys

class node:
    #create a node with data and empty left and right node.
    def __init__ (self, data):
        self.left = None
        self.right = None
        self.data = data
    
    def insert(self, data):
        if self.data:
            if data < self.data:
                if self.left is None:
                    self.left = node(data)
                else:
                    self.left.insert(data)
            elif data > self.data:
                if self.right is None:
                    self.right = node(data)
                else:
                    self.right.insert(data)
        else:
            self.data = data
    
    def printTree(self):
        print(self.data)
        if self.left:
            self.left.printTree()
        if self.right:
            self.right.printTree()

    def search(self,data):
        if self.data is None:
            return "Data Not found"
        if self.data == data:
            return "Data found"
        elif self.data > data:
            return self.left.search(data)
        elif self.data < data:
            return self.right.search(data)
        
            

root = node(100)
root.insert(200)
root.insert(20)
root.insert(1000)
root.insert(1)
print "root"
root.printTree()
print root.search(00)


    
