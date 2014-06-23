/*
* generated by Xtext
*/
grammar InternalPersistence;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package de.linma.breakout.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.linma.breakout.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.linma.breakout.services.PersistenceGrammarAccess;

}

@parser::members {
 
 	private PersistenceGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(PersistenceGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelAccess().getPersistenceModelParserRuleCall()); }
	rulePersistenceModel
{ after(grammarAccess.getModelAccess().getPersistenceModelParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePersistenceModel
entryRulePersistenceModel 
:
{ before(grammarAccess.getPersistenceModelRule()); }
	 rulePersistenceModel
{ after(grammarAccess.getPersistenceModelRule()); } 
	 EOF 
;

// Rule PersistenceModel
rulePersistenceModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPersistenceModelAccess().getGroup()); }
(rule__PersistenceModel__Group__0)
{ after(grammarAccess.getPersistenceModelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePersistenceEntity
entryRulePersistenceEntity 
:
{ before(grammarAccess.getPersistenceEntityRule()); }
	 rulePersistenceEntity
{ after(grammarAccess.getPersistenceEntityRule()); } 
	 EOF 
;

// Rule PersistenceEntity
rulePersistenceEntity
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPersistenceEntityAccess().getGroup()); }
(rule__PersistenceEntity__Group__0)
{ after(grammarAccess.getPersistenceEntityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleProperty
entryRuleProperty 
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPropertyAccess().getUnorderedGroup()); }
(rule__Property__UnorderedGroup)
{ after(grammarAccess.getPropertyAccess().getUnorderedGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PersistenceModel__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceModel__Group__0__Impl
	rule__PersistenceModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getPersistenceModelKeyword_0()); }

	'PersistenceModel' 

{ after(grammarAccess.getPersistenceModelAccess().getPersistenceModelKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceModel__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceModel__Group__1__Impl
	rule__PersistenceModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getNameAssignment_1()); }
(rule__PersistenceModel__NameAssignment_1)
{ after(grammarAccess.getPersistenceModelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceModel__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceModel__Group__2__Impl
	rule__PersistenceModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPersistenceModelAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceModel__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceModel__Group__3__Impl
	rule__PersistenceModel__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesAssignment_3()); }
(rule__PersistenceModel__PersistenceEntitiesAssignment_3)*
{ after(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceModel__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceModel__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getPersistenceModelAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__PersistenceEntity__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group__0__Impl
	rule__PersistenceEntity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getPersistenceEntityKeyword_0()); }

	'PersistenceEntity' 

{ after(grammarAccess.getPersistenceEntityAccess().getPersistenceEntityKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group__1__Impl
	rule__PersistenceEntity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); }
(rule__PersistenceEntity__NameAssignment_1)
{ after(grammarAccess.getPersistenceEntityAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group__2__Impl
	rule__PersistenceEntity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getPersistenceEntityAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group__3__Impl
	rule__PersistenceEntity__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()); }
(rule__PersistenceEntity__UnorderedGroup_3)
{ after(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getPersistenceEntityAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__PersistenceEntity__Group_3_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group_3_0__0__Impl
	rule__PersistenceEntity__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group_3_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNameAssignment_3_0_0()); }
(rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0)
{ after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNameAssignment_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group_3_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group_3_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group_3_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getPersistenceNameAssignment_3_0_1()); }
(rule__PersistenceEntity__PersistenceNameAssignment_3_0_1)
{ after(grammarAccess.getPersistenceEntityAccess().getPersistenceNameAssignment_3_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__PersistenceEntity__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group_3_1__0__Impl
	rule__PersistenceEntity__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getIdPropertyKeyword_3_1_0()); }

	'idProperty' 

{ after(grammarAccess.getPersistenceEntityAccess().getIdPropertyKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getIdPropertyAssignment_3_1_1()); }
(rule__PersistenceEntity__IdPropertyAssignment_3_1_1)
{ after(grammarAccess.getPersistenceEntityAccess().getIdPropertyAssignment_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0__0__Impl
	rule__Property__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_0_0()); }

	'Property' 

{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0__1__Impl
	rule__Property__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameAssignment_0_1()); }
(rule__Property__NameAssignment_0_1)
{ after(grammarAccess.getPropertyAccess().getNameAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0__2__Impl
	rule__Property__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_0_2()); }

	'{' 

{ after(grammarAccess.getPropertyAccess().getLeftCurlyBracketKeyword_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_0_3()); }
(rule__Property__Group_0_3__0)?
{ after(grammarAccess.getPropertyAccess().getGroup_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Property__Group_0_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0_3__0__Impl
	rule__Property__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getIsNullableAssignment_0_3_0()); }
(rule__Property__IsNullableAssignment_0_3_0)
{ after(grammarAccess.getPropertyAccess().getIsNullableAssignment_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_0_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_0_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNullableAssignment_0_3_1()); }
(rule__Property__NullableAssignment_0_3_1)
{ after(grammarAccess.getPropertyAccess().getNullableAssignment_0_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_1__0__Impl
	rule__Property__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getGroup_1_0()); }
(rule__Property__Group_1_0__0)
{ after(grammarAccess.getPropertyAccess().getGroup_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_1_1()); }

	'}' 

{ after(grammarAccess.getPropertyAccess().getRightCurlyBracketKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Property__Group_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_1_0__0__Impl
	rule__Property__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeKeyword_1_0_0()); }

	'type' 

{ after(grammarAccess.getPropertyAccess().getTypeKeyword_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeAssignment_1_0_1()); }
(rule__Property__TypeAssignment_1_0_1)
{ after(grammarAccess.getPropertyAccess().getTypeAssignment_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__PersistenceEntity__UnorderedGroup_3
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
    }
:
	rule__PersistenceEntity__UnorderedGroup_3__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__UnorderedGroup_3__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getPersistenceEntityAccess().getGroup_3_0()); }
						(rule__PersistenceEntity__Group_3_0__0)
						{ after(grammarAccess.getPersistenceEntityAccess().getGroup_3_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getPersistenceEntityAccess().getGroup_3_1()); }
						(rule__PersistenceEntity__Group_3_1__0)
						{ after(grammarAccess.getPersistenceEntityAccess().getGroup_3_1()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3(), 2);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					(
						{ before(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); }
						(rule__PersistenceEntity__PropertyAssignment_3_2)
						{ after(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); }
					)
					(
						{ before(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); }
						((rule__PersistenceEntity__PropertyAssignment_3_2)=>rule__PersistenceEntity__PropertyAssignment_3_2)*
						{ after(grammarAccess.getPersistenceEntityAccess().getPropertyAssignment_3_2()); }
					)					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPersistenceEntityAccess().getUnorderedGroup_3());
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__UnorderedGroup_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__UnorderedGroup_3__Impl
	rule__PersistenceEntity__UnorderedGroup_3__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__UnorderedGroup_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__UnorderedGroup_3__Impl
	rule__PersistenceEntity__UnorderedGroup_3__2?
;
finally {
	restoreStackSize(stackSize);
}


rule__PersistenceEntity__UnorderedGroup_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PersistenceEntity__UnorderedGroup_3__Impl
;
finally {
	restoreStackSize(stackSize);
}








rule__Property__UnorderedGroup
    @init {
    	int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getPropertyAccess().getUnorderedGroup());
    }
:
	rule__Property__UnorderedGroup__0
	
	{getUnorderedGroupHelper().canLeave(grammarAccess.getPropertyAccess().getUnorderedGroup())}?
	
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getPropertyAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Property__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
    }
:
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 0);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getPropertyAccess().getGroup_0()); }
						(rule__Property__Group_0__0)
						{ after(grammarAccess.getPropertyAccess().getGroup_0()); }
					)
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup(), 1);
	 				}
	 				{
	 				  selected = true;
	 				}
					(
					
						{ before(grammarAccess.getPropertyAccess().getGroup_1()); }
						(rule__Property__Group_1__0)
						{ after(grammarAccess.getPropertyAccess().getGroup_1()); }
					)
 				)
			)  

		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}


rule__Property__UnorderedGroup__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__UnorderedGroup__Impl
	rule__Property__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__UnorderedGroup__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Property__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}






rule__PersistenceModel__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPersistenceModelAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceModel__PersistenceEntitiesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); }
	rulePersistenceEntity{ after(grammarAccess.getPersistenceModelAccess().getPersistenceEntitiesPersistenceEntityParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getPersistenceEntityAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__HasPersistenceNameAssignment_3_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); }
(
{ before(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); }

	'persistenceName' 

{ after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); }
)

{ after(grammarAccess.getPersistenceEntityAccess().getHasPersistenceNamePersistenceNameKeyword_3_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__PersistenceNameAssignment_3_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getPersistenceNameSTRINGTerminalRuleCall_3_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getPersistenceEntityAccess().getPersistenceNameSTRINGTerminalRuleCall_3_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__IdPropertyAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getIdPropertyPropertyParserRuleCall_3_1_1_0()); }
	ruleProperty{ after(grammarAccess.getPersistenceEntityAccess().getIdPropertyPropertyParserRuleCall_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PersistenceEntity__PropertyAssignment_3_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPersistenceEntityAccess().getPropertyPropertyParserRuleCall_3_2_0()); }
	ruleProperty{ after(grammarAccess.getPersistenceEntityAccess().getPropertyPropertyParserRuleCall_3_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_1_0()); }
	RULE_ID{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__IsNullableAssignment_0_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); }
(
{ before(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); }

	'isNullable' 

{ after(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); }
)

{ after(grammarAccess.getPropertyAccess().getIsNullableIsNullableKeyword_0_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NullableAssignment_0_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getNullableBOOLEANTerminalRuleCall_0_3_1_0()); }
	RULE_BOOLEAN{ after(grammarAccess.getPropertyAccess().getNullableBOOLEANTerminalRuleCall_0_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeAssignment_1_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPropertyAccess().getTypeTYPETerminalRuleCall_1_0_1_0()); }
	RULE_TYPE{ after(grammarAccess.getPropertyAccess().getTypeTYPETerminalRuleCall_1_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_TYPE : ('String'|'Boolean'|'Integer'|'Byte');

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

