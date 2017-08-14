// 第一个阶段
for(j=1; j<=m; j=j+1) 
   xn[j] = 初始值;

// 其他n-1个阶段
for(i=n-1; i>=1; i=i-1)
   for(j=1; j>=f(i); j=j+1)//f(i)与i有关的表达式
     xi[j]=j=max（或min）{g(xi-1[j1:j2]), ......, g(xi-1[jk:jk+1])};

// 由子问题的最优解求解整个问题的最优解的方案
t = g(x1[j1:j2]); 

print(x1[j1]);

for(i=2; i<=n-1; i=i+1）
{  
     t = t-xi-1[ji];
     for(j=1; j>=f(i); j=j+1)
     	if(t=xi[ji])
     		break;
}