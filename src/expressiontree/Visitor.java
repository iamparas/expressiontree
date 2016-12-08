package expressiontree;

public interface Visitor {
   
    void visit(NumberNode node);

   
    void visit(NegateOperatorNode node);

    
    void visit(AddOperatorNode node);

   
    void visit(SubtractOperatorNode node);

   
    void visit(DivisonOperatorNode node);

 
    void visit(MultiplicationOperatorNode node);
}
