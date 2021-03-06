/**
 * generated by Xtext
 */
package de.linma.breakout.generator;

import de.linma.breakout.persistence.PersistenceEntity;
import de.linma.breakout.persistence.PersistenceModel;
import de.linma.breakout.persistence.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class PersistenceGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final PersistenceModel persistenceModel = ((PersistenceModel) _head);
    EList<PersistenceEntity> _persistenceEntities = persistenceModel.getPersistenceEntities();
    for (final PersistenceEntity pEntity : _persistenceEntities) {
      {
        String _name = pEntity.getName();
        final String entityNameLower = StringExtensions.toFirstLower(_name);
        final CharSequence javaInterfaceCode = this.createEntityInterface(pEntity, entityNameLower);
        String _name_1 = pEntity.getName();
        String _plus = ((("/de/linma/breakout/data/" + entityNameLower) + "/I") + _name_1);
        String _plus_1 = (_plus + ".java");
        fsa.generateFile(_plus_1, javaInterfaceCode);
        final CharSequence javaBasecode = this.createEntityBase(pEntity, entityNameLower);
        String _name_2 = pEntity.getName();
        String _plus_2 = ((("/de/linma/breakout/data/" + entityNameLower) + "/") + _name_2);
        String _plus_3 = (_plus_2 + ".java");
        fsa.generateFile(_plus_3, javaBasecode);
        final CharSequence javaCouchDB = this.createEntityCouchDB(pEntity, entityNameLower);
        String _name_3 = pEntity.getName();
        String _plus_4 = ((("/de/linma/breakout/data/" + entityNameLower) + "/dao/impl/couchDB/") + _name_3);
        String _plus_5 = (_plus_4 + "CouchDB.java");
        fsa.generateFile(_plus_5, javaCouchDB);
        final CharSequence javaHibernate = this.createEntityHibernate(pEntity, entityNameLower);
        String _name_4 = pEntity.getName();
        String _plus_6 = ((("/de/linma/breakout/data/" + entityNameLower) + "/dao/impl/hibernate/") + _name_4);
        String _plus_7 = (_plus_6 + "Hibernate.java");
        fsa.generateFile(_plus_7, javaHibernate);
      }
    }
  }
  
  public CharSequence createEntityHibernate(final PersistenceEntity pEntity, final String entityNameLower) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".dao.impl.hibernate;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.persistence.Column;");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.append("import javax.persistence.Table;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".I");
    String _name = pEntity.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".");
    String _name_1 = pEntity.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("@Entity");
    _builder.newLine();
    _builder.append("@Table(name=\"");
    String _persistenceName = pEntity.getPersistenceName();
    _builder.append(_persistenceName, "");
    _builder.append("\")");
    _builder.newLineIfNotEmpty();
    _builder.append("@NoArgsConstructor");
    _builder.newLine();
    _builder.append("public class ");
    String _name_2 = pEntity.getName();
    _builder.append(_name_2, "");
    _builder.append("Hibernate extends ");
    String _name_3 = pEntity.getName();
    _builder.append(_name_3, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_4 = pEntity.getName();
    _builder.append(_name_4, "\t");
    _builder.append("Hibernate(I");
    String _name_5 = pEntity.getName();
    _builder.append(_name_5, "\t");
    _builder.append("  model");
    String _name_6 = pEntity.getName();
    _builder.append(_name_6, "\t");
    _builder.append(" ) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(model");
    String _name_7 = pEntity.getName();
    _builder.append(_name_7, "\t\t");
    _builder.append(" );");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_8 = pEntity.getName();
    _builder.append(_name_8, "\t");
    _builder.append("Hibernate(final ");
    Property _idProperty = pEntity.getIdProperty();
    String _type = _idProperty.getType();
    _builder.append(_type, "\t");
    _builder.append(" ");
    Property _idProperty_1 = pEntity.getIdProperty();
    String _name_9 = _idProperty_1.getName();
    _builder.append(_name_9, "\t");
    {
      EList<Property> _property = pEntity.getProperty();
      for(final Property property : _property) {
        _builder.append(", final ");
        String _type_1 = property.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" ");
        String _name_10 = property.getName();
        _builder.append(_name_10, "\t");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(");
    Property _idProperty_2 = pEntity.getIdProperty();
    String _name_11 = _idProperty_2.getName();
    _builder.append(_name_11, "\t\t");
    _builder.append(" ");
    {
      EList<Property> _property_1 = pEntity.getProperty();
      for(final Property property_1 : _property_1) {
        _builder.append(", ");
        String _name_12 = property_1.getName();
        _builder.append(_name_12, "\t\t");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Id");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Column(name = \"id\", nullable = false)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    Property _idProperty_3 = pEntity.getIdProperty();
    CharSequence _createSuperGetter = this.createSuperGetter(_idProperty_3);
    _builder.append(_createSuperGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    Property _idProperty_4 = pEntity.getIdProperty();
    CharSequence _createSuperSetter = this.createSuperSetter(_idProperty_4);
    _builder.append(_createSuperSetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _property_2 = pEntity.getProperty();
      for(final Property property_2 : _property_2) {
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Column(name = \"");
        String _name_13 = property_2.getName();
        _builder.append(_name_13, "\t");
        _builder.append("\", nullable = ");
        boolean _isIsNullable = property_2.isIsNullable();
        _builder.append(_isIsNullable, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        CharSequence _createSuperGetter_1 = this.createSuperGetter(property_2);
        _builder.append(_createSuperGetter_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("@Override");
        _builder.newLine();
        _builder.append("\t");
        CharSequence _createSuperSetter_1 = this.createSuperSetter(property_2);
        _builder.append(_createSuperSetter_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createEntityCouchDB(final PersistenceEntity pEntity, final String entityNameLower) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".dao.impl.couchDB;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.codehaus.jackson.annotate.JsonProperty;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import lombok.NoArgsConstructor;");
    _builder.newLine();
    _builder.append("import de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".I");
    String _name = pEntity.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(".");
    String _name_1 = pEntity.getName();
    _builder.append(_name_1, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("@NoArgsConstructor");
    _builder.newLine();
    _builder.append("public class ");
    String _name_2 = pEntity.getName();
    _builder.append(_name_2, "");
    _builder.append("CouchDB extends ");
    String _name_3 = pEntity.getName();
    _builder.append(_name_3, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String rev;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_4 = pEntity.getName();
    _builder.append(_name_4, "\t");
    _builder.append("CouchDB(I");
    String _name_5 = pEntity.getName();
    _builder.append(_name_5, "\t");
    _builder.append(" model");
    String _name_6 = pEntity.getName();
    _builder.append(_name_6, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(model");
    String _name_7 = pEntity.getName();
    _builder.append(_name_7, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (model");
    String _name_8 = pEntity.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append(" instanceof ");
    String _name_9 = pEntity.getName();
    _builder.append(_name_9, "\t\t");
    _builder.append("CouchDB) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("this.rev = ((");
    String _name_10 = pEntity.getName();
    _builder.append(_name_10, "\t\t\t");
    _builder.append("CouchDB) model");
    String _name_11 = pEntity.getName();
    _builder.append(_name_11, "\t\t\t");
    _builder.append(").getRev();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_12 = pEntity.getName();
    _builder.append(_name_12, "\t");
    _builder.append("CouchDB(final ");
    Property _idProperty = pEntity.getIdProperty();
    String _type = _idProperty.getType();
    _builder.append(_type, "\t");
    _builder.append(" ");
    Property _idProperty_1 = pEntity.getIdProperty();
    String _name_13 = _idProperty_1.getName();
    _builder.append(_name_13, "\t");
    {
      EList<Property> _property = pEntity.getProperty();
      for(final Property property : _property) {
        _builder.append(", final ");
        String _type_1 = property.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" ");
        String _name_14 = property.getName();
        _builder.append(_name_14, "\t");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(");
    Property _idProperty_2 = pEntity.getIdProperty();
    String _name_15 = _idProperty_2.getName();
    _builder.append(_name_15, "\t\t");
    _builder.append(" ");
    {
      EList<Property> _property_1 = pEntity.getProperty();
      for(final Property property_1 : _property_1) {
        _builder.append(", ");
        String _name_16 = property_1.getName();
        _builder.append(_name_16, "\t\t");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.rev = null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@JsonProperty(\"_id\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    Property _idProperty_3 = pEntity.getIdProperty();
    CharSequence _createSuperGetter = this.createSuperGetter(_idProperty_3);
    _builder.append(_createSuperGetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@JsonProperty(\"_id\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    Property _idProperty_4 = pEntity.getIdProperty();
    CharSequence _createSuperSetter = this.createSuperSetter(_idProperty_4);
    _builder.append(_createSuperSetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@JsonProperty(\"_rev\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getRev() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return rev;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@JsonProperty(\"_rev\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void setRev(String rev) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.rev = rev;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createEntityInterface(final PersistenceEntity pEntity, final String entityNameLower) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface I");
    String _name = pEntity.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    Property _idProperty = pEntity.getIdProperty();
    String _type = _idProperty.getType();
    _builder.append(_type, "\t");
    _builder.append(" get");
    Property _idProperty_1 = pEntity.getIdProperty();
    String _name_1 = _idProperty_1.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void set");
    Property _idProperty_2 = pEntity.getIdProperty();
    String _name_2 = _idProperty_2.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(");
    Property _idProperty_3 = pEntity.getIdProperty();
    String _type_1 = _idProperty_3.getType();
    _builder.append(_type_1, "\t");
    _builder.append(" ");
    Property _idProperty_4 = pEntity.getIdProperty();
    String _name_3 = _idProperty_4.getName();
    _builder.append(_name_3, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _property = pEntity.getProperty();
      for(final Property property : _property) {
        _builder.append("\t");
        _builder.append("public ");
        String _type_2 = property.getType();
        _builder.append(_type_2, "\t");
        _builder.append(" get");
        String _name_4 = property.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_2, "\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _name_5 = property.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_5);
        _builder.append(_firstUpper_3, "\t");
        _builder.append("(");
        String _type_3 = property.getType();
        _builder.append(_type_3, "\t");
        _builder.append(" ");
        String _name_6 = property.getName();
        _builder.append(_name_6, "\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int hashCode();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean equals(Object obj);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createEntityBase(final PersistenceEntity pEntity, final String entityNameLower) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package de.linma.breakout.data.");
    _builder.append(entityNameLower, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.Serializable;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = pEntity.getName();
    _builder.append(_name, "");
    _builder.append(" implements I");
    String _name_1 = pEntity.getName();
    _builder.append(_name_1, "");
    _builder.append(", Serializable {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private static final long serialVersionUID = 1L;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ");
    Property _idProperty = pEntity.getIdProperty();
    String _type = _idProperty.getType();
    _builder.append(_type, "\t");
    _builder.append(" ");
    Property _idProperty_1 = pEntity.getIdProperty();
    String _name_2 = _idProperty_1.getName();
    _builder.append(_name_2, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _property = pEntity.getProperty();
      for(final Property property : _property) {
        _builder.append("\t");
        _builder.append("private ");
        String _type_1 = property.getType();
        _builder.append(_type_1, "\t");
        _builder.append(" ");
        String _name_3 = property.getName();
        _builder.append(_name_3, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_4 = pEntity.getName();
    _builder.append(_name_4, "\t");
    _builder.append("(final ");
    Property _idProperty_2 = pEntity.getIdProperty();
    String _type_2 = _idProperty_2.getType();
    _builder.append(_type_2, "\t");
    _builder.append(" ");
    Property _idProperty_3 = pEntity.getIdProperty();
    String _name_5 = _idProperty_3.getName();
    _builder.append(_name_5, "\t");
    {
      EList<Property> _property_1 = pEntity.getProperty();
      for(final Property property_1 : _property_1) {
        _builder.append(", final ");
        String _type_3 = property_1.getType();
        _builder.append(_type_3, "\t");
        _builder.append(" ");
        String _name_6 = property_1.getName();
        _builder.append(_name_6, "\t");
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.");
    Property _idProperty_4 = pEntity.getIdProperty();
    String _name_7 = _idProperty_4.getName();
    _builder.append(_name_7, "\t\t");
    _builder.append(" = ");
    Property _idProperty_5 = pEntity.getIdProperty();
    String _name_8 = _idProperty_5.getName();
    _builder.append(_name_8, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _property_2 = pEntity.getProperty();
      for(final Property property_2 : _property_2) {
        _builder.append("\t\t");
        _builder.append("this.");
        String _name_9 = property_2.getName();
        _builder.append(_name_9, "\t\t");
        _builder.append(" = ");
        String _name_10 = property_2.getName();
        _builder.append(_name_10, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_11 = pEntity.getName();
    _builder.append(_name_11, "\t");
    _builder.append("(I");
    String _name_12 = pEntity.getName();
    _builder.append(_name_12, "\t");
    _builder.append(" ");
    _builder.append(entityNameLower, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this(");
    _builder.append(entityNameLower, "\t\t");
    _builder.append(".get");
    Property _idProperty_6 = pEntity.getIdProperty();
    String _name_13 = _idProperty_6.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_13);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("()");
    {
      EList<Property> _property_3 = pEntity.getProperty();
      for(final Property property_3 : _property_3) {
        _builder.append(", ");
        _builder.append(entityNameLower, "\t\t");
        _builder.append(".get");
        String _name_14 = property_3.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_14);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("()");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    Property _idProperty_7 = pEntity.getIdProperty();
    String _type_4 = _idProperty_7.getType();
    _builder.append(_type_4, "\t");
    _builder.append(" get");
    Property _idProperty_8 = pEntity.getIdProperty();
    String _name_15 = _idProperty_8.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_15);
    _builder.append(_firstUpper_2, "\t");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if (");
    Property _idProperty_9 = pEntity.getIdProperty();
    String _name_16 = _idProperty_9.getName();
    _builder.append(_name_16, "\t\t");
    _builder.append(" == null) {");
    _builder.newLineIfNotEmpty();
    {
      Property _idProperty_10 = pEntity.getIdProperty();
      String _type_5 = _idProperty_10.getType();
      boolean _equals = _type_5.equals("Integer");
      if (_equals) {
        _builder.append("\t\t\t");
        _builder.append("return 0;");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.append("return \"\";");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return ");
    Property _idProperty_11 = pEntity.getIdProperty();
    String _name_17 = _idProperty_11.getName();
    _builder.append(_name_17, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void set");
    Property _idProperty_12 = pEntity.getIdProperty();
    String _name_18 = _idProperty_12.getName();
    String _firstUpper_3 = StringExtensions.toFirstUpper(_name_18);
    _builder.append(_firstUpper_3, "\t");
    _builder.append("(");
    Property _idProperty_13 = pEntity.getIdProperty();
    String _type_6 = _idProperty_13.getType();
    _builder.append(_type_6, "\t");
    _builder.append(" ");
    Property _idProperty_14 = pEntity.getIdProperty();
    String _name_19 = _idProperty_14.getName();
    _builder.append(_name_19, "\t");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("this.");
    Property _idProperty_15 = pEntity.getIdProperty();
    String _name_20 = _idProperty_15.getName();
    _builder.append(_name_20, "\t\t");
    _builder.append(" = ");
    Property _idProperty_16 = pEntity.getIdProperty();
    String _name_21 = _idProperty_16.getName();
    _builder.append(_name_21, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Property> _property_4 = pEntity.getProperty();
      for(final Property property_4 : _property_4) {
        _builder.append("\t");
        _builder.append("public ");
        String _type_7 = property_4.getType();
        _builder.append(_type_7, "\t");
        _builder.append(" get");
        String _name_22 = property_4.getName();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_22);
        _builder.append(_firstUpper_4, "\t");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        {
          String _nullable = property_4.getNullable();
          boolean _equals_1 = _nullable.equals("false");
          if (_equals_1) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("if (");
            String _name_23 = property_4.getName();
            _builder.append(_name_23, "\t\t");
            _builder.append(" == null) {");
            _builder.newLineIfNotEmpty();
            {
              String _type_8 = property_4.getType();
              boolean _equals_2 = _type_8.equals("Integer");
              if (_equals_2) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return 0;");
                _builder.newLine();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return \"\";");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_24 = property_4.getName();
        _builder.append(_name_24, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public void set");
        String _name_25 = property_4.getName();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_25);
        _builder.append(_firstUpper_5, "\t");
        _builder.append("(");
        String _type_9 = property_4.getType();
        _builder.append(_type_9, "\t");
        _builder.append(" ");
        String _name_26 = property_4.getName();
        _builder.append(_name_26, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        String _name_27 = property_4.getName();
        _builder.append(_name_27, "\t\t");
        _builder.append(" = ");
        String _name_28 = property_4.getName();
        _builder.append(_name_28, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* (non-Javadoc)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @see java.lang.Object#hashCode()");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int hashCode() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final int prime = 31;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int result = 1;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("result = prime * result + ((");
    Property _idProperty_17 = pEntity.getIdProperty();
    String _name_29 = _idProperty_17.getName();
    _builder.append(_name_29, "\t\t");
    _builder.append(" == null) ? 0 : ");
    Property _idProperty_18 = pEntity.getIdProperty();
    String _name_30 = _idProperty_18.getName();
    _builder.append(_name_30, "\t\t");
    _builder.append(".hashCode());");
    _builder.newLineIfNotEmpty();
    {
      EList<Property> _property_5 = pEntity.getProperty();
      for(final Property property_5 : _property_5) {
        _builder.append("\t\t");
        _builder.append("result = prime * result + ((");
        String _name_31 = property_5.getName();
        _builder.append(_name_31, "\t\t");
        _builder.append(" == null) ? 0 : ");
        String _name_32 = property_5.getName();
        _builder.append(_name_32, "\t\t");
        _builder.append(".hashCode());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* (non-Javadoc)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* @see java.lang.Object#equals(java.lang.Object)");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean equals(Object obj) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (this == obj)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (obj == null)");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (getClass() != obj.getClass())");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t");
    String _name_33 = pEntity.getName();
    _builder.append(_name_33, "\t\t");
    _builder.append(" other = (");
    String _name_34 = pEntity.getName();
    _builder.append(_name_34, "\t\t");
    _builder.append(") obj;");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("if(");
    Property _idProperty_19 = pEntity.getIdProperty();
    String _name_35 = _idProperty_19.getName();
    _builder.append(_name_35, "\t\t");
    _builder.append(" == null){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("if(other.get");
    Property _idProperty_20 = pEntity.getIdProperty();
    String _name_36 = _idProperty_20.getName();
    String _firstUpper_6 = StringExtensions.toFirstUpper(_name_36);
    _builder.append(_firstUpper_6, "\t\t\t");
    _builder.append("() != null){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} else if (!");
    Property _idProperty_21 = pEntity.getIdProperty();
    String _name_37 = _idProperty_21.getName();
    _builder.append(_name_37, "\t\t");
    _builder.append(".equals(other.get");
    Property _idProperty_22 = pEntity.getIdProperty();
    String _name_38 = _idProperty_22.getName();
    String _firstUpper_7 = StringExtensions.toFirstUpper(_name_38);
    _builder.append(_firstUpper_7, "\t\t");
    _builder.append("()))");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Property> _property_6 = pEntity.getProperty();
      for(final Property property_6 : _property_6) {
        _builder.append("\t\t");
        _builder.append("if(");
        String _name_39 = property_6.getName();
        _builder.append(_name_39, "\t\t");
        _builder.append(" == null){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("if(other.get");
        String _name_40 = property_6.getName();
        String _firstUpper_8 = StringExtensions.toFirstUpper(_name_40);
        _builder.append(_firstUpper_8, "\t\t\t");
        _builder.append("() != null){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("} ");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("} else if (!");
        String _name_41 = property_6.getName();
        _builder.append(_name_41, "\t\t");
        _builder.append(".equals(other.get");
        String _name_42 = property_6.getName();
        String _firstUpper_9 = StringExtensions.toFirstUpper(_name_42);
        _builder.append(_firstUpper_9, "\t\t");
        _builder.append("()))");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createSuperGetter(final Property prop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _type = prop.getType();
    _builder.append(_type, "");
    _builder.append(" get");
    String _name = prop.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("return super.get");
    String _name_1 = prop.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createSuperSetter(final Property prop) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void set");
    String _name = prop.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    String _type = prop.getType();
    _builder.append(_type, "");
    _builder.append(" ");
    String _name_1 = prop.getName();
    _builder.append(_name_1, "");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("super.set");
    String _name_2 = prop.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("(");
    String _name_3 = prop.getName();
    _builder.append(_name_3, "\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
