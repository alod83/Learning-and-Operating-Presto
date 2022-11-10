var presto = require('presto-client');
var client = new presto.Client({
 user: 'client', 
 host: 'presto-coordinator', 
 port: '8080'
});

client.execute({
  query:   'SELECT * FROM customer LIMIT 5',
  catalog: 'tpch',
  schema:  'sf1',
  source:  'nodejs-client',
  data:    function(error, data, columns, stats){ console.log(data); },
  success: function(error, stats){console.log(stats);},
  error:   function(error){console.log(error);}
});

