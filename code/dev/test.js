const Blockchain = require('./blockchain');

const bitcoin = new Blockchain();

const bc1 = {
"chain": [
{
"index": 1,
"timestamp": 1552299192777,
"transactions": [],
"nonce": 100,
"hash": "0",
"previousBlockHash": "0"
},
{
"index": 2,
"timestamp": 1552299323193,
"transactions": [],
"nonce": 18140,
"hash": "0000b9135b054d1131392c9eb9d03b0111d4b516824a03c35639e12858912100",
"previousBlockHash": "0"
},
{
"index": 3,
"timestamp": 1552299376628,
"transactions": [
{
"amount": 12.5,
"sender": "00",
"recipient": "4735d48043e611e9ad6a31718c6b0d3b"
},
{
"amount": 50,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
},
{
"amount": 20,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
},
{
"amount": 30,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
}
],
"nonce": 93524,
"hash": "000024cfb39902f9bd7d386f0b47d1d8510b745db8e5735af771202cbc27170e",
"previousBlockHash": "0000b9135b054d1131392c9eb9d03b0111d4b516824a03c35639e12858912100"
},
{
"index": 4,
"timestamp": 1552299421036,
"transactions": [
{
"amount": 12.5,
"sender": "00",
"recipient": "4735d48043e611e9ad6a31718c6b0d3b"
},
{
"amount": 40,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
},
{
"amount": 60,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
},
{
"amount": 70,
"sender": "Adjhgfsdkvjgtr3wqdF",
"recipient": "qwkjalskdjyefrgbtgfvdcs"
}
],
"nonce": 185014,
"hash": "0000a1fc19f834ce53cc5d1fe6f8914c1991040dd46099449bc7be396f2aa617",
"previousBlockHash": "000024cfb39902f9bd7d386f0b47d1d8510b745db8e5735af771202cbc27170e"
},
{
"index": 5,
"timestamp": 1552299437163,
"transactions": [
{
"amount": 12.5,
"sender": "00",
"recipient": "4735d48043e611e9ad6a31718c6b0d3b"
}
],
"nonce": 183943,
"hash": "0000306c7d8465c463998a711dc1bdb9307b5fdd5eb4fc641c168ad32a309d6d",
"previousBlockHash": "0000a1fc19f834ce53cc5d1fe6f8914c1991040dd46099449bc7be396f2aa617"
},
{
"index": 6,
"timestamp": 1552299442848,
"transactions": [
{
"amount": 12.5,
"sender": "00",
"recipient": "4735d48043e611e9ad6a31718c6b0d3b"
}
],
"nonce": 57036,
"hash": "00007ca06b4ba263e04a9e1ced46e3834cc95027d58a8160c2eb947b825e1518",
"previousBlockHash": "0000306c7d8465c463998a711dc1bdb9307b5fdd5eb4fc641c168ad32a309d6d"
}
],
"pendingTransactions": [
{
"amount": 12.5,
"sender": "00",
"recipient": "4735d48043e611e9ad6a31718c6b0d3b"
}
],
"currentNodeUrl": "http://localhost:3001",
"networkNodes": []
}



console.log('valid: ', bitcoin.chainIsValid(bc1.chain));
