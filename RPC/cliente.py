import xmlrpc.client

servidor = xmlrpc.client.ServerProxy(

"http://localhost:9000/"

)

print(servidor.soma(10, 20))
print(servidor.subtracao(10, 20))
print(servidor.multiplicacao(10, 20))
print(servidor.divisao(10, 20))

