# #Node Class declaration
# class Node:

#     def __init__(self,data):
#         self.data = data
#         self.next = None

# class LinkedList:
#     def __init__(self):
#         self.head = None
    

# llist = LinkedList()
# llist.head = Node(1)
# first = llist.head
# second = Node(2)
# third = Node(3)

# llist.head.next = second
# second.next = third

# print(first,second,third)
class Node:
    def __init__(self,data):
        self.data = data
        self.next = None
class LinkedList:
    def __init__(self):
        self.head = None
llist = LinkedList()
llist.head = Node(1)
first = llist.head
second = Node(2)
third = Node(3)

llist.head.next = second
second.next = third
print(first.data,second.data,third.data)