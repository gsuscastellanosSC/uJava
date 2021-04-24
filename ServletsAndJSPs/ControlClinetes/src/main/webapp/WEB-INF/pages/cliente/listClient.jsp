<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib  prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="es_CO"/>
<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <h4 class="card-header">Listado de Clientes</h4>
                </div>
                <table class="table table-striped">
                    <thead class="table table-dark">
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Saldo</th>
                            <th>Acción</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- Iteramos cada elemento de la lista de clientes -->
                        <c:forEach var="cliente" items="${clientes}">
                            <tr>
                                <td>${cliente.idCliente}</td>
                                <td>${cliente.nombre} ${cliente.apellido}</td>
                                <td>
                                    <fmt:formatNumber value="${cliente.saldo}" type="currency">
                                    </fmt:formatNumber></td>
                                <th>
                                    <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}" class="btn btn-secondary">
                                        <i class="fas fa-angle-double-right">Editar</i>
                                    </a>
                                </th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>

            <!--Tarjetas para los totales -->
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Saldo Total</h3>
                        <h4 class="dysplay-4"><fmt:formatNumber value="${saldoTotal}" type="currency"/>
                        </h4>
                    </div>
                </div>
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Total clientes</h3>
                        <h4 class="dysplay-4">
                            <i class="fas fa-users"></i>
                            ${totalClientes}
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Agregar cliente MODAL -->
<jsp:include page="/WEB-INF/pages/cliente/addClient.jsp"/>
