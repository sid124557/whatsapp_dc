package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0UB  reason: invalid class name */
public class AnonymousClass0UB {
    public static final HashMap A04 = AnonymousClass001.A0t();
    public static final Class[] A05 = {Context.class, AttributeSet.class};
    public AnonymousClass0Pz A00;
    public String[] A01;
    public final Context A02;
    public final Object[] A03 = AnonymousClass002.A0M();

    public final Preference A00(AttributeSet attributeSet, String str) {
        try {
            if (-1 == str.indexOf(46)) {
                return A01(attributeSet, str, this.A01);
            }
            return A01(attributeSet, str, (String[]) null);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(AnonymousClass000.A0V(": Error inflating class (not found)", str, AnonymousClass000.A0i(attributeSet)));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(AnonymousClass000.A0V(": Error inflating class ", str, AnonymousClass000.A0i(attributeSet)));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r1 = r1 + 1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r1 >= r4) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        throw new android.view.InflateException(X.AnonymousClass000.A0U(r10.getPositionDescription(), ": Error inflating class ", r11, X.AnonymousClass001.A0o()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        r1 = new android.view.InflateException(X.AnonymousClass000.A0U(r10.getPositionDescription(), ": Error inflating class ", r11, X.AnonymousClass001.A0o()));
        r1.initCause(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e A[ExcHandler: Exception (r2v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.preference.Preference A01(android.util.AttributeSet r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r9 = this;
            java.util.HashMap r8 = A04
            java.lang.Object r1 = r8.get(r11)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.String r3 = ": Error inflating class "
            r7 = 1
            if (r1 != 0) goto L_0x0053
            android.content.Context r0 = r9.A02     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.ClassLoader r6 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            r5 = 0
            if (r12 == 0) goto L_0x0043
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            if (r4 == 0) goto L_0x0043
            r2 = 0
            r1 = 0
        L_0x001b:
            r0 = r12[r1]     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.String r0 = X.AnonymousClass000.A0T(r0, r11)     // Catch:{ ClassNotFoundException -> 0x0026, Exception -> 0x005e }
            java.lang.Class r1 = java.lang.Class.forName(r0, r5, r6)     // Catch:{ ClassNotFoundException -> 0x0026, Exception -> 0x005e }
            goto L_0x002c
        L_0x0026:
            r2 = move-exception
            int r1 = r1 + 1
            if (r1 >= r4) goto L_0x0042
            goto L_0x001b
        L_0x002c:
            if (r1 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.String r0 = r10.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.String r1 = X.AnonymousClass000.A0U(r0, r3, r11, r1)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            android.view.InflateException r0 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
        L_0x0042:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
        L_0x0043:
            java.lang.Class r1 = java.lang.Class.forName(r11, r5, r6)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
        L_0x0047:
            java.lang.Class[] r0 = A05     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            r1.setAccessible(r7)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            r8.put(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
        L_0x0053:
            java.lang.Object[] r0 = r9.A03     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            r0[r7] = r10     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x005e }
            return r0
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            java.lang.String r0 = X.AnonymousClass000.A0U(r0, r3, r11, r1)
            android.view.InflateException r1 = new android.view.InflateException
            r1.<init>(r0)
            r1.initCause(r2)
            throw r1
        L_0x0074:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UB.A01(android.util.AttributeSet, java.lang.String, java.lang.String[]):androidx.preference.Preference");
    }

    public AnonymousClass0UB(Context context, AnonymousClass0Pz r6) {
        this.A02 = context;
        this.A00 = r6;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(Preference.class.getPackage().getName());
        this.A01 = new String[]{AnonymousClass000.A0X(".", A0o), AnonymousClass000.A0V(SwitchPreference.class.getPackage().getName(), ".", AnonymousClass001.A0o())};
    }

    public final void A02(AttributeSet attributeSet, Preference preference, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else if (next == 1) {
                return;
            } else {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.A06 = Intent.parseIntent(this.A02.getResources(), xmlPullParser, attributeSet);
                        } catch (IOException e) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        Resources resources = this.A02.getResources();
                        Bundle bundle = preference.A08;
                        if (bundle == null) {
                            bundle = AnonymousClass002.A08();
                            preference.A08 = bundle;
                        }
                        resources.parseBundleExtra("extra", attributeSet, bundle);
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1) {
                                    if (next2 == 3 && xmlPullParser.getDepth() <= depth2) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e2);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference A002 = A00(attributeSet, name);
                        ((PreferenceGroup) preference).A0W(A002);
                        A02(attributeSet, A002, xmlPullParser);
                    }
                }
            }
        }
    }
}
