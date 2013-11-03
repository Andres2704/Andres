package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.Rule;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.Symbol;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.patternmatching.PatternMatcher;

public class Rule extends AbstractFunctionEvaluator {

	public Rule() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 3);
		final EvalEngine engine = EvalEngine.get();
		IExpr leftHandSide = ast.arg1();
		if (leftHandSide.isAST()) {
			leftHandSide = PatternMatcher.evalLeftHandSide((IAST) leftHandSide, engine);
		}
		IExpr arg2 = EvalEngine.evalNull(ast.arg2());
		if (arg2 == null) {
			if (leftHandSide.equals(ast.arg1())) {
				return null;
			}
			return Rule(leftHandSide, ast.get(2));
		}

		return Rule(leftHandSide, arg2);
	}

	@Override
	public void setUp(final ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}
}
