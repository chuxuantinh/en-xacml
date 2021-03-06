package an.xacml;

import static javax.xml.datatype.DatatypeConstants.TIME;
import static javax.xml.datatype.DatatypeConstants.DATE;
import static javax.xml.datatype.DatatypeConstants.DATETIME;

import java.net.URI;

import an.xml.XMLDataTypeRegistry;

/**
 * Define all constants in this interface.
 */
public abstract interface Constants {
    public static final String[] SUPPORTED_XPATH_VERSIONS = {"http://www.w3.org/TR/1999/Rec-xpath-19991116"};

    public static final String POLICY_NAMESPACE = "urn:oasis:names:tc:xacml:2.0:policy:schema:os";
    public static final String CONTEXT_NAMESPACE = "urn:oasis:names:tc:xacml:2.0:context:schema:os";
    public static final String POLICY_SCHEMA_LOCATION = "http://docs.oasis-open.org/xacml/2.0/access_control-xacml-2.0-policy-schema-os.xsd";
    public static final String CONTEXT_SCHEMA_LOCATION = "http://docs.oasis-open.org/xacml/2.0/access_control-xacml-2.0-context-schema-os.xsd";
    // Reserved prefixes
    public static final String XACML_NAMESPACE = "urn:oasis:names:tc:xacml:2.0";
    public static final String PREFIX_SUBJECT = "urn:oasis:names:tc:xacml:1.0:subject";
    public static final String PREFIX_RESOURCE = "urn:oasis:names:tc:xacml:1.0:resource";
    public static final String PREFIX_ACTION = "urn:oasis:names:tc:xacml:1.0:action";
    public static final String PREFIX_ENVIRONMENT = "urn:oasis:names:tc:xacml:1.0:environment";
    public static final String PREFIX_CONFORMANCETEST = "urn:oasis:names:tc:xacml:2.0:conformance-test";
    public static final String PREFIX_CONTEXT = "urn:oasis:names:tc:xacml:2.0:context";
    public static final String PREFIX_EXAMPLE = "urn:oasis:names:tc:xacml:2.0:example";
    public static final String PREFIX_1_FUNCTION = "urn:oasis:names:tc:xacml:1.0:function";
    public static final String PREFIX_2_FUNCTION = "urn:oasis:names:tc:xacml:2.0:function";
    public static final String PREFIX_POLICY = "urn:oasis:names:tc:xacml:2.0:policy";
    public static final String PREFIX_STATUS = "urn:oasis:names:tc:xacml:1.0:status";
    // Combine algorithms
    public static final URI ALG_RULE_DENYOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:deny-overrides");
    public static final URI ALG_RULE_PERMITOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:permit-overrides");
    public static final URI ALG_RULE_FIRSTAPPLICABLE = URI.create("urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:first-applicable");
    public static final URI ALG_RULE_ORDEREDDENYOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-deny-overrides");
    public static final URI ALG_RULE_ORDEREDPERMITOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-permit-overrides");
    public static final URI ALG_POLICY_DENYOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:deny-overrides");
    public static final URI ALG_POLICY_PERMITOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:permit-overrides");
    public static final URI ALG_POLICY_FIRSTAPPLICABLE = URI.create("urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:first-applicable");
    public static final URI ALG_POLICY_ONLYONEAPPLICABLE = URI.create("urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:only-one-applicable");
    public static final URI ALG_POLICY_ORDEREDDENYOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-deny-overrides");
    public static final URI ALG_POLICY_ORDEREDPERMITOVERRIDES = URI.create("urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-permit-overrides");
    // The status code defined by XACML 2.0
    public static final URI STATUS_OK = URI.create("urn:oasis:names:tc:xacml:1.0:status:ok");
    public static final URI STATUS_MISSINGATTRIBUTE = URI.create("urn:oasis:names:tc:xacml:1.0:status:missing-attribute");
    public static final URI STATUS_SYNTAXERROR = URI.create("urn:oasis:names:tc:xacml:1.0:status:syntax-error");
    public static final URI STATUS_PROCESSINGERROR = URI.create("urn:oasis:names:tc:xacml:1.0:status:processing-error");
    // The custom status code
    public static final URI STATUS_SERVERERROR = URI.create("an:xacml:2.0:status:server-error");
    public static final URI STATUS_UNKNOWNERROR = URI.create("an:xacml:2.0:status:unknown-error");
    // Environment attributes
    public static final URI ATTR_TIME = URI.create("urn:oasis:names:tc:xacml:1.0:environment:current-time");
    public static final URI ATTR_DATE = URI.create("urn:oasis:names:tc:xacml:1.0:environment:current-date");
    public static final URI ATTR_DATETIME = URI.create("urn:oasis:names:tc:xacml:1.0:environment:current-dateTime");
    // Reserved identifiers
    public static final URI ATTR_DNSNAME = URI.create("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:dns-name");
    public static final URI ATTR_IPADDRESS = URI.create("urn:oasis:names:tc:xacml:1.0:subject:authn-locality:ip-address");
    public static final URI ATTR_ATNMETHOD = URI.create("urn:oasis:names:tc:xacml:1.0:subject:authentication-method");
    public static final URI ATTR_ATNTIME = URI.create("urn:oasis:names:tc:xacml:1.0:subject:authentication-time");
    public static final URI ATTR_KEYINFO = URI.create("urn:oasis:names:tc:xacml:1.0:subject:key-info");
    public static final URI ATTR_REQUESTTIME = URI.create("urn:oasis:names:tc:xacml:1.0:subject:request-time");
    public static final URI ATTR_SESSIONTIME = URI.create("urn:oasis:names:tc:xacml:1.0:subject:session-start-time");
    public static final URI ATTR_SUBJECT_ID = URI.create("urn:oasis:names:tc:xacml:1.0:subject:subject-id");
    public static final URI ATTR_SUBJECT_IDQUALIFIER = URI.create("urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier");
    public static final URI ATTR_SUBJECT_CATEGORY_ACCESS = URI.create("urn:oasis:names:tc:xacml:1.0:subject-category:access-subject");
    public static final URI ATTR_SUBJECT_CATEGORY_CODEBASE = URI.create("urn:oasis:names:tc:xacml:1.0:subject-category:codebase");
    public static final URI ATTR_SUBJECT_CATEGORY_INTERMEDIARY = URI.create("urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject");
    public static final URI ATTR_SUBJECT_CATEGORY_RECIPIENT = URI.create("urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject");
    public static final URI ATTR_SUBJECT_CATEGORY_REQUESTINGMACHINE = URI.create("urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine");
    public static final URI ATTR_RESOURCE_LOCATION = URI.create("urn:oasis:names:tc:xacml:1.0:resource:resource-location");
    public static final URI ATTR_RESOURCE_ID = URI.create("urn:oasis:names:tc:xacml:1.0:resource:resource-id");
    public static final URI ATTR_RESOURCE_FILENAME = URI.create("urn:oasis:names:tc:xacml:1.0:resource:simple-file-name");
    public static final URI ATTR_ACTION_ID = URI.create("urn:oasis:names:tc:xacml:1.0:action:action-id");
    public static final URI ATTR_ACTION_IMPLIED = URI.create("urn:oasis:names:tc:xacml:1.0:action:implied-action");
    // XACML used types
    public static final URI TYPE_TIME = URI.create(XMLDataTypeRegistry.XMLTypeAsString(TIME));
    public static final URI TYPE_DATE = URI.create(XMLDataTypeRegistry.XMLTypeAsString(DATE));
    public static final URI TYPE_DATETIME = URI.create(XMLDataTypeRegistry.XMLTypeAsString(DATETIME));
    public static final URI TYPE_STRING = URI.create("http://www.w3.org/2001/XMLSchema#string");
    public static final URI TYPE_BOOLEAN = URI.create("http://www.w3.org/2001/XMLSchema#boolean");
    public static final URI TYPE_INTEGER = URI.create("http://www.w3.org/2001/XMLSchema#integer");
    public static final URI TYPE_DOUBLE = URI.create("http://www.w3.org/2001/XMLSchema#double");
    public static final URI TYPE_ANYURI = URI.create("http://www.w3.org/2001/XMLSchema#anyURI");
    public static final URI TYPE_DNSNAME = URI.create("urn:oasis:names:tc:xacml:1.0:data-type:dnsName");
    public static final URI TYPE_IPADDRESS = URI.create("urn:oasis:names:tc:xacml:1.0:data-type:ipAdress");
    public static final URI TYPE_RFC822NAME = URI.create("urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name");
    public static final URI TYPE_X500NAME = URI.create("urn:oasis:names:tc:xacml:1.0:data-type:x500Name");
    public static final URI TYPE_DAYTIMEDURATION = URI.create("urn:oasis:names:tc:xacml:2.0:data-type:dayTimeDuration");
    public static final URI TYPE_YEARMONTHDURATION = URI.create("urn:oasis:names:tc:xacml:2.0:data-types:yearMonthDuration");
    public static final URI TYPE_BASE64BINARY = URI.create("http://www.w3.org/2001/XMLSchema#base64Binary");
    public static final URI TYPE_HEXBINARY = URI.create("http://www.w3.org/2001/XMLSchema#hexBinary");
    // Functions
    public static final URI FUNC_STRING_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-equal");
    public static final URI FUNC_BOOLEAN_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-equal");
    public static final URI FUNC_INTEGER_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-equal");
    public static final URI FUNC_DOUBLE_EUQAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-equal");
    public static final URI FUNC_DATE_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-equal");
    public static final URI FUNC_TIME_EUQAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-equal");
    public static final URI FUNC_DATETIME_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-equal");
    public static final URI FUNC_DATETIMEDURATION_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-equal");
    public static final URI FUNC_YEARMONTHDURATION_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-equal");
    public static final URI FUNC_ANYURI_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-equal");
    public static final URI FUNC_X500NAME_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-equal");
    public static final URI FUNC_RFC822NAME_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal");
    public static final URI FUNC_HEXBINARY_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal");
    public static final URI FUNC_BASE64BINARY = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal");
    public static final URI FUNC_INTEGER_ADD = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-add");
    public static final URI FUNC_DOUBLE_ADD = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-add");
    public static final URI FUNC_INTEGER_SUBTRACT = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-subtract");
    public static final URI FUNC_DOUBLE_SUBTRACT = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-subtract");
    public static final URI FUNC_INTEGER_MULTIPLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-multiply");
    public static final URI FUNC_DOUBLE_MULTIPLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-multiply");
    public static final URI FUNC_INTEGER_DIVIDE = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-divide");
    public static final URI FUNC_DOUBLE_DIVIDE = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-divide");
    public static final URI FUNC_INTEGER_MOD = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-mod");
    public static final URI FUNC_INTEGER_ABS = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-abs");
    public static final URI FUNC_DOUBLE_ABS = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-abs");
    public static final URI FUNC_ROUND = URI.create("urn:oasis:names:tc:xacml:1.0:function:round");
    public static final URI FUNC_FLOOR = URI.create("urn:oasis:names:tc:xacml:1.0:function:floor");
    public static final URI FUNC_STRING_NORMALIZE_SPACE = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-normalize-space");
    public static final URI FUNC_STRING_NORMALIZE_TO_LOWER_CASE = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case");
    public static final URI FUNC_DOUBLE_TO_INTEGER = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-to-integer");
    public static final URI FUNC_INTEGER_TO_DOUBLE = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-to-double");
    public static final URI FUNC_OR = URI.create("urn:oasis:names:tc:xacml:1.0:function:or");
    public static final URI FUNC_AND = URI.create("urn:oasis:names:tc:xacml:1.0:function:and");
    public static final URI FUNC_N_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:n-of");
    public static final URI FUNC_NOT = URI.create("urn:oasis:names:tc:xacml:1.0:function:not");
    public static final URI FUNC_INTEGER_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-greater-than");
    public static final URI FUNC_INTEGER_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal");
    public static final URI FUNC_INTEGER_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-less-than");
    public static final URI FUNC_INTEGER_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal");
    public static final URI FUNC_DOUBLE_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-greater-than");
    public static final URI FUNC_DOUBLE_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal");
    public static final URI FUNC_DOUBLE_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-less-than");
    public static final URI FUNC_DOUBLE_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal");
    public static final URI FUNC_DATETIME_ADD_DAYTIMEDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-add-dayTimeDuration");
    public static final URI FUNC_DATETIME_ADD_YEARMONTHDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-add-yearMonthDuration");
    public static final URI FUNC_DATETIME_SUBTRACT_DAYTIMEDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-dayTimeDuration");
    public static final URI FUNC_DATETIME_SUBTRACT_YEARMONTHDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-subtract-yearMonthDuration");
    public static final URI FUNC_DATE_ADD_YEARMONTHDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-add-yearMonthDuration");
    public static final URI FUNC_DATE_SUBTRACT_YEARMONTHDURATION = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-subtract-yearMonthDuration");
    public static final URI FUNC_STRING_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-greater-than");
    public static final URI FUNC_STRING_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal");
    public static final URI FUNC_STRING_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-less-than");
    public static final URI FUNC_STRING_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal");
    public static final URI FUNC_TIME_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-greater-than");
    public static final URI FUNC_TIME_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal");
    public static final URI FUNC_TIME_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-less-than");
    public static final URI FUNC_TIME_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal");
    public static final URI FUNC_TIME_IN_RANGE = URI.create("urn:oasis:names:tc:xacml:2.0:function:time-in-range");
    public static final URI FUNC_DATETIME_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than");
    public static final URI FUNC_DATETIME_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal");
    public static final URI FUNC_DATETIME_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than");
    public static final URI FUNC_DATETIME_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal");
    public static final URI FUNC_DATE_GREATER_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-greater-than");
    public static final URI FUNC_DATE_GREATER_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal");
    public static final URI FUNC_DATE_LESS_THAN = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-less-than");
    public static final URI FUNC_DATE_LESS_THAN_OR_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal");
    public static final URI FUNC_STRING_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-one-and-only");
    public static final URI FUNC_STRING_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-bag-size");
    public static final URI FUNC_STRING_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-is-in");
    public static final URI FUNC_STRING_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-bag");
    public static final URI FUNC_BOOLEAN_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-one-and-only");
    public static final URI FUNC_BOOLEAN_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-bag-size");
    public static final URI FUNC_BOOLEAN_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-is-in");
    public static final URI FUNC_BOOLEAN_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-bag");
    public static final URI FUNC_INTEGER_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-one-and-only");
    public static final URI FUNC_INTEGER_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-bag-size");
    public static final URI FUNC_INTEGER_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-is-in");
    public static final URI FUNC_INTEGER_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-bag");
    public static final URI FUNC_DOUBLE_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-one-and-only");
    public static final URI FUNC_DOUBLE_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-bag-size");
    public static final URI FUNC_DOUBLE_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-is-in");
    public static final URI FUNC_DOUBLE_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-bag");
    public static final URI FUNC_TIME_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-one-and-only");
    public static final URI FUNC_TIME_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-bag-size");
    public static final URI FUNC_TIME_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-is-in");
    public static final URI FUNC_TIME_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-bag");
    public static final URI FUNC_DATE_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-one-and-only");
    public static final URI FUNC_DATE_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-bag-size");
    public static final URI FUNC_DATE_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-is-in");
    public static final URI FUNC_DATE_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-bag");
    public static final URI FUNC_DATETIME_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-one-and-only");
    public static final URI FUNC_DATETIME_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-bag-size");
    public static final URI FUNC_DATETIME_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in");
    public static final URI FUNC_DATETIME_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-bag");
    public static final URI FUNC_ANYURI_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-one-and-only");
    public static final URI FUNC_ANYURI_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-bag-size");
    public static final URI FUNC_ANYURI_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in");
    public static final URI FUNC_ANTURI_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-bag");
    public static final URI FUNC_HEXBINARY_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-one-and-only");
    public static final URI FUNC_HEXBINARY_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag-size");
    public static final URI FUNC_HEXBINARY_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in");
    public static final URI FUNC_HEXBINARY_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag");
    public static final URI FUNC_BASE64BINARY_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-one-and-only");
    public static final URI FUNC_BASE64BINARY_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag-size");
    public static final URI FUNC_BASE64BINARY_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in");
    public static final URI FUNC_BASE64BINARY_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag");
    public static final URI FUNC_DAYTIMEDURATION_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-one-and-only");
    public static final URI FUNC_DAYTIMEDURATION_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag-size");
    public static final URI FUNC_DAYTIMEDURATION_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-is-in");
    public static final URI FUNC_DAYTIMEDURATION_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-bag");
    public static final URI FUNC_YEARMONTHDURATION_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-one-and-only");
    public static final URI FUNC_YEARMONTHDURATION_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag-size");
    public static final URI FUNC_YEARMONTHDURATION_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-is-in");
    public static final URI FUNC_YEARMONTHDURATION_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-bag");
    public static final URI FUNC_X500NAME_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-one-and-only");
    public static final URI FUNC_X500NAME_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-bag-size");
    public static final URI FUNC_X500NAME_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in");
    public static final URI FUNC_X500NAME_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-bag");
    public static final URI FUNC_RFC822NAME_ONE_AND_ONLY = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-one-and-only");
    public static final URI FUNC_RFC822NAME_BAG_SIZE = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag-size");
    public static final URI FUNC_RFC822NAME_IS_IN = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in");
    public static final URI FUNC_RFC822NAME_BAG = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag");
    public static final URI FUNC_STRING_CONCATENATE = URI.create("urn:oasis:names:tc:xacml:2.0:function:string-concatenate");
    public static final URI FUNC_URI_STRING_CONCATENATE = URI.create("urn:oasis:names:tc:xacml:2.0:function:uri-string-concatenate");
    public static final URI FUNC_ANY_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:any-of");
    public static final URI FUNC_ALL_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:all-of");
    public static final URI FUNC_ANY_OF_ANY = URI.create("urn:oasis:names:tc:xacml:1.0:function:any-of-any");
    public static final URI FUNC_ALL_OF_ANY = URI.create("urn:oasis:names:tc:xacml:1.0:function:all-of-any");
    public static final URI FUNC_ANY_OF_ALL = URI.create("urn:oasis:names:tc:xacml:1.0:function:any-of-all");
    public static final URI FUNC_ALL_OF_ALL = URI.create("urn:oasis:names:tc:xacml:1.0:function:all-of-all");
    public static final URI FUNC_MAP = URI.create("urn:oasis:names:tc:xacml:1.0:function:map");
    public static final URI FUNC_X500NAME_MATCH = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-match");
    public static final URI FUNC_RFC822NAME_MATCH = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-match");
    public static final URI FUNC_STRING_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-regexp-match");
    public static final URI FUNC_ANTURI_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:2.0:function:anyURI-regexp-match");
    public static final URI FUNC_IPADDRESS_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:2.0:function:ipAddress-regexp-match");
    public static final URI FUNC_DNSNAME_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:2.0:function:dnsName-regexp-match");
    public static final URI FUNC_RFC822NAME_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:2.0:function:rfc822Name-regexp-match");
    public static final URI FUNC_X500NAME_REGEXP_MATCH = URI.create("urn:oasis:names:tc:xacml:2.0:function:x500Name-regexp-match");
    public static final URI FUNC_XPATH_NODE_COUNT = URI.create("urn:oasis:names:tc:xacml:1.0:function:xpath-node-count");
    public static final URI FUNC_XPATH_NODE_EQUAL = URI.create("urn:oasis:names:tc:xacml:1.0:function:xpath-node-equal");
    public static final URI FUNC_XPATH_NODE_MATCH = URI.create("urn:oasis:names:tc:xacml:1.0:function:xpath-node-match");
    public static final URI FUNC_STRING_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-intersection");
    public static final URI FUNC_STRING_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-at-least-one-member-of");
    public static final URI FUNC_STRING_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-union");
    public static final URI FUNC_STRING_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-subset");
    public static final URI FUNC_STRING_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:string-set-equals");
    public static final URI FUNC_BOOLEAN_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-intersection");
    public static final URI FUNC_BOOLEAN_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-at-least-one-member-of");
    public static final URI FUNC_BOOLEAN_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-union");
    public static final URI FUNC_BOOLEAN_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-subset");
    public static final URI FUNC_BOOLEAN_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:boolean-set-equals");
    public static final URI FUNC_INTEGER_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-intersection");
    public static final URI FUNC_INTEGER_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-at-least-one-member-of");
    public static final URI FUNC_INTEGER_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-union");
    public static final URI FUNC_INTEGER_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-subset");
    public static final URI FUNC_INTEGER_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:integer-set-equals");
    public static final URI FUNC_DOUBLE_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-intersection");
    public static final URI FUNC_DOUBLE_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-at-least-one-member-of");
    public static final URI FUNC_DOUBLE_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-union");
    public static final URI FUNC_DOUBLE_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-subset");
    public static final URI FUNC_DOUBLE_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:double-set-equals");
    public static final URI FUNC_TIME_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-intersection");
    public static final URI FUNC_TIME_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-at-least-one-member-of");
    public static final URI FUNC_TIME_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-union");
    public static final URI FUNC_TIME_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-subset");
    public static final URI FUNC_TIME_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:time-set-equals");
    public static final URI FUNC_DATE_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-intersection");
    public static final URI FUNC_DATE_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-at-least-one-member-of");
    public static final URI FUNC_DATE_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-union");
    public static final URI FUNC_DATE_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-subset");
    public static final URI FUNC_DATE_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:date-set-equals");
    public static final URI FUNC_DATETIME_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-intersection");
    public static final URI FUNC_DATETIME_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-at-least-one-member-of");
    public static final URI FUNC_DATETIME_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-union");
    public static final URI FUNC_DATETIME_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-subset");
    public static final URI FUNC_DATETIME_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:dateTime-set-equals");
    public static final URI FUNC_ANYURI_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-intersection");
    public static final URI FUNC_ANYURI_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-at-least-one-member-of");
    public static final URI FUNC_ANYURI_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-union");
    public static final URI FUNC_ANYURI_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-subset");
    public static final URI FUNC_ANYURI_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:anyURI-set-equals");
    public static final URI FUNC_HEXBINARY_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-intersection");
    public static final URI FUNC_HEXBINARY_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-at-least-one-member-of");
    public static final URI FUNC_HEXBINARY_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-union");
    public static final URI FUNC_HEXBINARY_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-subset");
    public static final URI FUNC_HEXBINARY_SET_EQUALS= URI.create("urn:oasis:names:tc:xacml:1.0:function:hexBinary-set-equals");
    public static final URI FUNC_BASE64BINARY_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-intersection");
    public static final URI FUNC_BASE64BINARY_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-at-least-one-member-of");
    public static final URI FUNC_BASE64BINARY_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-union");
    public static final URI FUNC_BASE64BINARY_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-subset");
    public static final URI FUNC_BASE64BINARY_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:base64Binary-set-equals");
    public static final URI FUNC_DAYTIMEDURATION_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-intersection");
    public static final URI FUNC_DAYTIMEDURATION_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-at-least-one-member-of");
    public static final URI FUNC_DAYTIMEDURATION_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-union");
    public static final URI FUNC_DAYTIMEDURATION_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-subset");
    public static final URI FUNC_DAYTIMEDURATION_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:dayTimeDuration-set-equals");
    public static final URI FUNC_YEARMONTHDURATION_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-intersection");
    public static final URI FUNC_YEARMONTHDURATION_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-at-least-one-member-of");
    public static final URI FUNC_YEARMONTHDURATION_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-union");
    public static final URI FUNC_YEARMONTHDURATION_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-subset");
    public static final URI FUNC_YEARMONTHDURATION_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:yearMonthDuration-set-equals");
    public static final URI FUNC_X500NAME_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-intersection");
    public static final URI FUNC_X500NAME_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-at-least-one-member-of");
    public static final URI FUNC_X500NAME_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-union");
    public static final URI FUNC_X500NAME_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-subset");
    public static final URI FUNC_X500NAME_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:x500Name-set-equals");
    public static final URI FUNC_RFC822NAME_INTERSECTION = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-intersection");
    public static final URI FUNC_RFC822NAME_AT_LEAST_ONE_MEMBER_OF = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-at-least-one-member-of");
    public static final URI FUNC_RFC822NAME_UNION = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-union");
    public static final URI FUNC_RFC822NAME_SUBSET = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-subset");
    public static final URI FUNC_RFC822NAME_SET_EQUALS = URI.create("urn:oasis:names:tc:xacml:1.0:function:rfc822Name-set-equals");

    public static final an.xacml.policy.Version POLICY_DEFAULT_VERSION = new an.xacml.policy.Version("1.0");
}