import threading
import time

# Recursos simulados
resource_a = threading.Lock()
resource_b = threading.Lock()

def thread1():
    print("Hilo 1: Intentando adquirir Recurso A")
    resource_a.acquire()
    print("Hilo 1: Recurso A adquirido")
    time.sleep(1)
    print("Hilo 1: Intentando adquirir Recurso B")
    resource_b.acquire()
    print("Hilo 1: Recurso B adquirido")
    resource_b.release()
    resource_a.release()
    print("Hilo 1: Recursos liberados")

def thread2():
    print("Hilo 2: Intentando adquirir Recurso B")
    resource_b.acquire()
    print("Hilo 2: Recurso B adquirido")
    time.sleep(1)
    print("Hilo 2: Intentando adquirir Recurso A")
    resource_a.acquire()
    print("Hilo 2: Recurso A adquirido")
    resource_a.release()
    resource_b.release()
    print("Hilo 2: Recursos liberados")

t1 = threading.Thread(target=thread1)
t2 = threading.Thread(target=thread2)

t1.start()
t2.start()

t1.join()
t2.join()

print("Programa finalizado")