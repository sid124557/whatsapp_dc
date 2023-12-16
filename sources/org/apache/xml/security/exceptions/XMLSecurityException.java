package org.apache.xml.security.exceptions;

import X.AnonymousClass000;
import X.AnonymousClass6C7;
import X.AnonymousClass6C9;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import org.apache.xml.security.utils.I18n;

public class XMLSecurityException extends Exception {
    public Exception a;
    public String b;

    public XMLSecurityException(String str, Object[] objArr, Exception exc) {
        super(MessageFormat.format(I18n.b(str), objArr));
        this.b = str;
        this.a = exc;
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printStream);
        }
    }

    public String toString() {
        String A0O = AnonymousClass000.A0O(this);
        String localizedMessage = super.getLocalizedMessage();
        if (localizedMessage != null) {
            A0O = AnonymousClass6C7.A0l(": ", localizedMessage, AnonymousClass6C9.A0i(A0O));
        }
        if (this.a == null) {
            return A0O;
        }
        StringBuffer A0i = AnonymousClass6C9.A0i(A0O);
        A0i.append("\nOriginal Exception was ");
        return AnonymousClass6C9.A0f(this.a.toString(), A0i);
    }

    public XMLSecurityException() {
        super("Missing message string");
        this.b = null;
        this.a = null;
    }

    public void printStackTrace() {
        PrintStream printStream = System.err;
        synchronized (printStream) {
            super.printStackTrace(printStream);
            Exception exc = this.a;
            if (exc != null) {
                exc.printStackTrace(printStream);
            }
        }
    }

    public XMLSecurityException(String str) {
        super(I18n.b(str));
        this.b = str;
        this.a = null;
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printWriter);
        }
    }

    public XMLSecurityException(String str, Object[] objArr) {
        super(MessageFormat.format(I18n.b(str), objArr));
        this.b = str;
        this.a = null;
    }

    public XMLSecurityException(String str, Exception exc) {
        super(I18n.a(str, exc));
        this.b = str;
        this.a = exc;
    }
}
