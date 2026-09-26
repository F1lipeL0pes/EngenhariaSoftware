from xmlrpc.server import SimpleXMLRPCServer

def soma(a, b):

    print(f"Recebi uma chamada: soma({a}, {b})")

    return a + b


def subtracao(a, b):

    print(f"Recebi uma chamada: subtracao({a}, {b})")

    return a - b

def multiplicacao(a, b):

    print(f"Recebi uma chamada: multiplicacao({a}, {b})")

    return a * b

def divisao(a, b):

    print(f"Recebi uma chamada: divisao({a}, {b})")

    return a / b


servidor = SimpleXMLRPCServer(
("localhost", 9000),
allow_none=True
)

servidor.register_function(soma, "soma")
servidor.register_function(subtracao, "subtracao")
servidor.register_function(multiplicacao, "multiplicacao")
servidor.register_function(divisao, "divisao")

print("Servidor RPC executando na porta 9000...")

servidor.serve_forever()
