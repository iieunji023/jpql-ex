package dialect;

import org.hibernate.boot.model.FunctionContributor;
import org.hibernate.dialect.H2Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.boot.model.FunctionContributions;

    public class MyH2Dialect extends H2Dialect implements FunctionContributor {
        // Dialect 생성자에서 기본적인 기능을 추가
        public MyH2Dialect() {
            super();
        }

        //    public MyH2Dialect() {
        //        registerFunction("group_concat", new StandardSQLFunction("group_concat", StandardBasicTypes.STRING));
        //    }

        @Override
        public void contributeFunctions(FunctionContributions functionContributions) {
            functionContributions.getFunctionRegistry()
                    .register("group_concat", new StandardSQLFunction("group_concat", StandardBasicTypes.STRING));
        }


}
