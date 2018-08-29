function display (tab) {
    for(var i=0; i<tab.length; i++) {
    document.write(tab[i]+"");
}
document.write("<br/>");
}

function sum(tab) {
    var res=0;
    for(var i=0; i<tab.length; i++) {
    res += tab[i];
    }
    return (res);
}

function avg(tab) {
return sum(tab)/tab.length;
}

function max(tab) {
    var max=tab[0]=0;
    for (i=0; i<tab.length; i++) {
        if (tab[i]>max) {
            max=tab[i];
        }
    }
return max
}

function isPrimeNumber (i) {
    var res= true
    for (j=2; j<i; j++) {
        if (i%j==0) {
            res= false
            break;
        }
    }
return res;
}

function getNumberPrime (tab) {
    var res= new Array ();
    for (var i=0; i<tab.length; i++){
   
    if (isPrimeNumber (tab [i]))  {
        res.push(tab[i]);
    }
    }      
return res;
}