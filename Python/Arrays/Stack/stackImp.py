import sys


class Stack():
    def __init__(self):
        self.items = []
    def push(self,ele):
        self.items.append(ele)
    def pop(self):
         return self.items.pop()
    def getstack(self):
        return self.items
    def is_Empty(self):
        return self.items==[]
    def peek(self):
        if  self.is_Empty()==False:
            return self.items[-1]

mystack = Stack()
while True:
    option = int(input("Enter your choice\n 1.push\t 2.pop\t 3.getstack\t 4.peek\t 5.is_Empty\t 6.end\n"))
    if option==1:
        mystack.push(input("Enter element to be inserted"))
    if option==2:
        print(mystack.pop())
    if option==3:
        print(mystack.getstack())
    if option==4:
        print(mystack.peek())
    if option==5:
        print(mystack.is_Empty())
    if option==6:
        sys.exit

