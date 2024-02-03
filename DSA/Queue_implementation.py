class Queue:
    def __init__(self,q):
        self.q = q
    
    def enqueue(self,ele):
        self.q.append(ele)

    def dequeue(self):
        if len(self.q) < 1:
            return False
        return self.q.pop(0)

    def display(self):
        print(self.q)      
q = []
s = Queue(q)
s.display()
s.enqueue(9)
s.display()
s.enqueue(8)
s.display()
s.enqueue(7)
s.display()
s.dequeue()
s.display()
s.dequeue()
s.display()



    