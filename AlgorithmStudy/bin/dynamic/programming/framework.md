// ��һ���׶�
for(j=1; j<=m; j=j+1) 
   xn[j] = ��ʼֵ;

// ����n-1���׶�
for(i=n-1; i>=1; i=i-1)
   for(j=1; j>=f(i); j=j+1)//f(i)��i�йصı��ʽ
     xi[j]=j=max����min��{g(xi-1[j1:j2]), ......, g(xi-1[jk:jk+1])};

// ������������Ž����������������Ž�ķ���
t = g(x1[j1:j2]); 

print(x1[j1]);

for(i=2; i<=n-1; i=i+1��
{  
     t = t-xi-1[ji];
     for(j=1; j>=f(i); j=j+1)
     	if(t=xi[ji])
     		break;
}