from xmlrpc.server import SimpleXMLRPCServer
from socketserver import ThreadingMixIn

class ThreadedXMLRPCServer(ThreadingMixIn, SimpleXMLRPCServer):
    pass

def somar(a, b):
    return a + b

def subtrair(a, b):
    return a - b

def multiplicar(a, b):
    return a * b

def dividir(a, b):
    return a / b

servidor = ThreadedXMLRPCServer(
    ("localhost", 9000),
    allow_none=True
)

servidor.register_function(somar, "somar")
servidor.register_function(subtrair, "subtrair")
servidor.register_function(multiplicar, "multiplicar")
servidor.register_function(dividir, "dividir")

print("Servidor RPC rodando na porta 9000...")

servidor.serve_forever()
