from collections import deque

def balance(exp):
    if len(exp) == 0  or not exp:
        return False
    l = deque()
    for c in exp:
        # if c == "(" or c == "[" or c == "{":
        if c in "{([":
            l.append(c)
        
        elif c in "})]":# if l contains [  at the top ex {[ then  current char should be ] other wise false if it matches with ] 
            # then [ should be  matched and removed now l havind {  the next ele should match the } or any open brace;
            if (l[-1] == "{" and c != "}") or (l[-1] == "[" and c != "]") or (l[-1] == "(" and c != ")"):
                return False
            l.pop()
        
    


    return not l
exp = "{([])}"
print("result is",balance(exp))