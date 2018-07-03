l= [1,2,3,4,5,6,7,8,9]
i=3
x=l[i]
l.append(99)
l.remove(99)
for i in l:
    print(i)

#liste en intention
res=[x for x in l if x%2==0]
print(res)
res=[x+1 for x in l] #map x+1
print(res)
res=[x+1 for x in res if x%2==0] #filter+map
print(res)


#lambda
res= filter(lambda x:x%2==0,l) #lambda x:x+1<=> x-> x+1
res= map(lambda x:x+1,l)  #map
res= map(lambda x:x+1,filter(lambda x:x%2==0,l)) #map + filtre
