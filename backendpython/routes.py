from flask import Blueprint, request, jsonify
import models

routes = Blueprint('routes', __name__)

@routes.route('/provas', methods=['POST'])
def criar_prova():
    data = request.json
    models.criar_prova(data['nome'], data['data'])
    return jsonify({'message': 'Prova criada com sucesso!'})
