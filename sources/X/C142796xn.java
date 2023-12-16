package X;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;

/* renamed from: X.6xn  reason: invalid class name and case insensitive filesystem */
public enum C142796xn {
    GTE(">="),
    LTE("<="),
    EQ("=="),
    TSEQ("==="),
    NE("!="),
    TSNE("!=="),
    LT("<"),
    GT(">"),
    REGEX("=~"),
    NIN("NIN"),
    IN("IN"),
    CONTAINS("CONTAINS"),
    ALL("ALL"),
    SIZE("SIZE"),
    EXISTS("EXISTS"),
    A0L(CredentialProviderBaseController.TYPE_TAG),
    MATCHES("MATCHES"),
    EMPTY("EMPTY"),
    SUBSETOF("SUBSETOF"),
    ANYOF("ANYOF"),
    NONEOF("NONEOF");
    
    public final String operatorString;

    public String toString() {
        return this.operatorString;
    }

    /* access modifiers changed from: public */
    C142796xn(String str) {
        this.operatorString = str;
    }
}
