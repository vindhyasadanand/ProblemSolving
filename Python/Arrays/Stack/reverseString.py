class Stack():
    def __init__(self):
        self.items = []
    def push(self,ele):
        self.items.append(ele)
    def pop(self):
        if not self.is_Empty():
           return self.items.pop()
        else:
            print("Underflow condition stack is Empty")
    def getstack(self):
        return self.items
    def is_Empty(self):
        return self.items==[]
    def peek(self):
        if not self.is_Empty():
            return self.items[-1]
def rev_string(g_str):
    s = Stack()
    for char in g_str:
        s.push(char)
    rev_str = ""
    while not s.is_Empty():
        rev_str = rev_str + str(s.pop())
    print(rev_str)
g_str = input("Enter the string to be reversed\n")
rev_string(g_str)
'''
print(g_str[::-1])
in python this single line of code reverses given string
'''
