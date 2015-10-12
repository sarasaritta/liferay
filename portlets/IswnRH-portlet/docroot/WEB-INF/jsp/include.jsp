<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<script type="text/javascript" src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>

<link href="https://cdn.datatables.net/1.10.9/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
$(document).ready(function() {
    $('#example').DataTable( {
        "language": {
            "lengthMenu": "Affichage _MENU_ enregistrements par page",
            "zeroRecords": "Nothing found - sorry",
            "info": "Afficher la page _PAGE_ de _PAGES_",
            "infoEmpty": "Aucun résultats trouvé",
            "search":"rechercher",
            "infoFiltered": "(filtered from _MAX_ total records)"
        }
    } );
} );
</script>
<style type="text/css">


#nav {
	padding: 0; margin: 0;
}
#nav li {
	display: inline;
	list-style: none; /* nécessaire pour IE7 */
}

#nav {
	padding: 0; margin: 0;
	text-align: center; /* centrer le texte */
}
#nav li {
	display: inline;
	list-style: none;
}
#nav a {
	display:inline-block;
	margin: 0 570px;
	margin-left:-62em;
	background-color:#D3D3D3;
	width:10em;
}


</style>
<ul id="nav"><!--
	--><li><a href="#">Absences</a></li><!--
	--><li><a href="#">Congés</a></li><!--
	-->
</ul>