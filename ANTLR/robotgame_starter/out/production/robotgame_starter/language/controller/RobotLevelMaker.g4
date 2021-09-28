grammar RobotLevelMaker;

program: statement+;
statement: dimStatement | playerStatement | wallStatement | crateStatement;
dimStatement: DIM (LSQUARE XDIM RSQUARE) (LSQUARE XDIM RSQUARE) EOS;
XDIM: INT;
playerStatement: PLAYER (LSQUARE XDIM RSQUARE) (LSQUARE XDIM RSQUARE) EOS;

wallStatement: WALL (LSQUARE (XDIM) RSQUARE) (LSQUARE (XDIM) RSQUARE) EOS;
crateStatement: CRATE (LSQUARE XDIM RSQUARE) (LSQUARE XDIM RSQUARE) EOS;


DIM: 'DIM';
PLAYER: 'PLAYER';
EOS: ';';
WALL: 'WALL';
CRATE: 'CRATE';
LPAREN: '(';
RPAREN: ')';
LCURLY: '{';
RCURLY: '}';
LSQUARE: '[';
RSQUARE: ']';


WS: (' '| '\t' | '\n' | '\r') -> skip;
COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
INT: [0-9]+|[0-9]'-'[0-9]+;
STRING: '"' (~[\r\n])* '"';

