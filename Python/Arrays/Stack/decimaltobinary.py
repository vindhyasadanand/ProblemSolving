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
def int_to_bin(dec_num):
    s = Stack()
    while dec_num>0:
        remainder = dec_num % 2
        s.push(remainder)
        dec_num = dec_num//2
    bin_num = ""
    while not s.is_Empty():
        bin_num = bin_num + str(s.pop())
    return bin_num
dec_num = int(input("Enter the decimal number\n"))
print(int_to_bin(dec_num))
