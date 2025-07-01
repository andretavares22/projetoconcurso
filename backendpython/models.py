from database import get_db_connection

def criar_prova(nome, data):
    conn = get_db_connection()
    cursor = conn.cursor()
    cursor.execute('INSERT INTO prova (nome, data) VALUES (%s, %s)', (nome, data))
    conn.commit()
    conn.close()
