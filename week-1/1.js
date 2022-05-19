<html>
	<head>
		<script>
			var dg = ['zero','one','two','three','four','five','six','seven','eight','nine'];
			var tn = ['ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen','eighteen','nineteen'];
			var tw = ['tewnty','thirty','fourty','fifty','sixty','seventy','eighty','ninty'];
			function change()
			{ var numstring = document.getElementById('anumber').value;
			  var output = towords(numstring);
			  document.getElementById('aresult').value = output;
			}
			function towords(s)
			{ if(s!=parseFloat(s))
				return 'Not a Number';
			  var x=s.indexOf('.');
			  if(x==-1)
				x=s.length;
			  if(x>3 || s[0]=='-')
				return 'out of range';
			  var n=s.split('');
			  var str='';
			  for(var i=0;i<x;i++)
			  { if((x-i)%3==2)
				{	if(n[i]=='1')
				    { str += tn[Number(n[i+1])]+' ';
					  i++;
					}
					else if(n[i]!='0')
						str += tw[n[i]-2]+' ';
				}
				else if(n[i]!='0')
				{ str += dg[n[i]]+' ';
				  if((x-i)%3==0)
					str += 'hundred'+" " ;
				}
			  }
			  return str;
			}
		</script>
	</head>
	<body bgcolor='yellow'>
		<h1>converting to words <h1>
		<form>
			Enter the number : <input type="text" id="anumber"><br>
			<input type='button' value="convert to words" onClick='change()'><br>
			Convert number : <input type="text" id="aresult" size='40'><br>
		</form>
	</body>
</html>