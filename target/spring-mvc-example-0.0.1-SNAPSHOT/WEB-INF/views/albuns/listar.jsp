<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Listagem de albuns</h2>
<br/>
<table class="table">
 	<thead>
 		<th>ID</th>
 		<th>Nome do Album</th>
 		<th>Ano de Lançamento</th>
 		<th>Ações</th>
 	</thead>
 	<tbody>
 		<c:if test="${!empty albuns}"></c:if>
 			<c:forEach items="${albuns}" var="album"></c:forEach>
 				<tr>
 					<td>${album.id}</td>
 					<td>${album.nome}</td>
 					<td>${album.dataLancamento}</td>
 					<td><a href="/SpringMVCExample/albuns/alterar/${album.id}">Alterar</a> |
 						<a href="/SpringMVCExample/albuns/excluir/${album.id}">Excluir</a> |
 					</td>
 				</tr>
 	</tbody>
</table>
<br/>
<a href="/SpringMVCExample/albuns/adicionar" class="btn btn-default">Adicionar novo Album</a>