def apply(L, f):
  """
  Applies function given by f to each element in L
  Parameters
  ----------
  L : list containing the operands
  f : the function
  Returns
  -------
  result: resulting list
  """

  result = []
  for i in range(len(L)):
    result.append(f(L[i]))
 
  return result
  
L = [1, -2, -5, 6.2]
print apply(L, abs)  # [1, 2, 5, 6.2]
# abs is applied on elements passed in L
print apply(L, int)  # [1, -2, -5, 6]

def sqr(n):
    return n**2

for i in map(sqr,[1, -2, -5, 6.2]):
    print(i)