$("document").ready(function(){
 			
 		$(".signin").on("click",function(e){
 			 e.preventDefault();
 			var user=$(".un").val();
			var pass=$(".pass").val();
 			$.post("Controller/logincheck",{
 				username:user,
 				password:pass
 			},function(data,status){
 				if(data=="success"){
 					window.location.href="Homepage.jsp";
 				}else{
 					$("#invalid").text(data);
 				}
 			});
 		});
 		 	$(".signup").on("click",function(e){
 		 		e.preventDefault();
 		 		var userup=$(".un").val();
 				var passup=$(".pass").val();
 			$.post("Controller/signup",{
 				username:userup,
 				password:passup
 			},function(data,status){
 				if(status=="success"){
 					$("#invalid").text(data).css("color","green");
 				}else{
 					$("#invalid").text(data);
 				}
 			});
 		}); 
 	});
 	
 	