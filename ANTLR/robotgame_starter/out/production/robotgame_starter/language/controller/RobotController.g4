grammar RobotController;

program: statement+;
statement: moveStatement | rotateStatement | loopStatement | logStatement;
moveStatement: MOVE (LPAREN amount RPAREN)? EOS;
rotateStatement: ROTATE (LPAREN direction RPAREN)? EOS;
direction: STRING;
loopStatement: LOOP (LPAREN amount RPAREN) LCURLY statement+ RCURLY;
amount: INT;
logStatement: LOG (LPAREN logMessage RPAREN)? EOS;
logMessage: STRING;


MOVE: 'move';
ROTATE: 'rotate';
EOS: ';';
LOOP: 'loop';
LOG: 'log';
LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';


WS: (' '| '\t' | '\n' | '\r') -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
INT: [0-9]+;
STRING: '"' (~[\r\n])* '"';
