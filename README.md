# LeetCode
# 9.9 first commit
1. Sum Problem
1, 15, 16, 18, 39, 40 etc
Solve: 
# 9.10 second commit
From begin to end, pick up an element each time and use two pointers to reduce the range.
Time: O(n^2)
Tips: margin condition
# 9.11
java: res.add(new ArrayList<Integer>(levelRes)); 
c++: res.push_back(levelRes);

An object needs to be instantiated.

LongestSubString:  
HashSet, check if it's unique. An object of set

reverse list:
three pointers:
p, q
p = head, head.next = null
a->b->c->d->e
null<-a b->c->d->e (r = q->next, q: b)
a<-b c->d->e (p: b, q: c, r: d)
...
a<-b<-c<-d<-e (p: e, q: null, r: null)

Reverse words:
split: regular expression(\\s+): avoid 'b    a'
trim

# 9.13
find restaurant:
To initialize a map we need two object classes. Map<String, Integer>




