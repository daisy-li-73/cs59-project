grammar Autograde;

// Author: Warren Shepard and Daisy Li
// Date: 24 July 2024
// Credit: code from A01/A02 and slides

// getting started
start : list ;
list : expr | list expr ;
expr : new | variable | configure | test_list | method_call ;

// for making new grader
new : name EQUAL NEW name LPREN RPREN;

// for variables
variable : name EQUAL (test_list | id | num);

// for speciying how a function should be graded
test_list : LBRACK test_item ( test_item )* RBRACK; // specity a list of one or more tests for a function including input, expected output, and points awarded
test_item : ( input_list | input ) COMMA expected_output ( COMMA points )? SEMICOLON ;          // a single item or test_list containing input, expected output, and points awarded (optional)
input_list : LBRACK input ( COMMA input )* RBRACK ;      // a list of one or more function inputs surrounded in brackets
input : num | bool | string_literal | id ;             // input for a function: can either be a real number, boolean, string, or reference to a variable (id)
expected_output : num | bool | string_literal ;        // expected output of a function
points : num | POINTS EQUAL num ;                      // can either input points or "points = ___ "

// for configureing the grader
configure : id DOT CONFIGURE (UNDERSCORE id)? LBRACK config_list RBRACK;
config_list : config_item (COMMA config_item)* ;
config_item : config_key EQUAL config_value ;
config_key : DUE_DATE | LATE_PENALTY | EARLY_TIME | EARLY_REWARD | LANGUAGE | FUNCTIONS | FUNCTION | TEST_CASES |POINTS ;
config_value : time | date | name | function_name | function_list | id | num ;
function_list : LBRACK function_name ( COMMA function_name )* RBRACK ;

// for method_call
method_call : id DOT name method_list ;
method_list : LPREN method_item (COMMA method_item)* RPREN ;
method_item : name EQUAL method_item_val ;
method_item_val : STRING | date | submission_time | bool | function_name;

// general "helpers"
id : LETTER (LETTER | DIGIT)* ;
submission_time : DIGIT DIGIT COLON DIGIT DIGIT ;    // hour:minutes (in 24 hour time)
name : LETTER (LETTER | UNDERSCORE | DIGIT)+ ;
function_name : name LPREN RPREN ;
num : DIGIT+ | decimal ;
decimal : DIGIT* DOT DIGIT+ ;
bool : TRUE | FALSE ;
string_literal : STRING ;
date : DIGIT DIGIT SLASH DIGIT DIGIT SLASH DIGIT DIGIT DIGIT DIGIT ; // in day/month/year format
time : num LETTER ;                                   // number + minutes (m) hours (h) or days (d)

// tokens
DIGIT : [0-9];
LETTER : [a-zA-Z];
SEMICOLON : ';';
LBRACK : '{' ;
RBRACK : '}' ;
LPREN : '(' ;
RPREN : ')' ;
EQUAL : '=' ;
COLON : ':' ;
FALSE : 'False' ;
TRUE : 'True' ;
COMMA : ',' ;
DOT : '.' ;
UNDERSCORE : '_' ;
SLASH : '/' ;
NEW : 'new' ;

// a string contians escape chars or any char that is not (which we use the tilde to denote)
// a double quote, backslash, carriage return, or newline
STRING : '"' ( ESC | ~["\\\r\n] )* '"' ;
fragment ESC : '\\' [btnfr"\\] ;

WS : [ \t\r\n]+ -> skip;

// KEYWORDS
CONFIGURE : 'configure' ;

// for function grading
POINTS : 'points' ;
TEST_CASES : 'test_cases' ;
FUNCTION : 'function' ;

// for general configure
DUE_DATE : 'due_date' ;
LATE_PENALTY : 'late_penalty' ;
EARLY_TIME : 'early_time' ;
EARLY_REWARD : 'early_reward' ;
LANGUAGE : 'language' ;
FUNCTIONS : 'functions' ;