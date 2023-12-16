package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0Pz  reason: invalid class name */
public class AnonymousClass0Pz {
    public long A00 = 0;
    public Context A01;
    public SharedPreferences.Editor A02;
    public SharedPreferences A03;
    public C15160qs A04;
    public C15170qt A05;
    public C16000sJ A06;
    public PreferenceScreen A07;
    public String A08;
    public boolean A09;

    /* JADX INFO: finally extract failed */
    public PreferenceScreen A02(Context context, PreferenceScreen preferenceScreen, int i) {
        InflateException inflateException;
        int next;
        PreferenceGroup preferenceGroup;
        this.A09 = true;
        AnonymousClass0UB r6 = new AnonymousClass0UB(context, this);
        Context context2 = r6.A02;
        XmlResourceParser xml = context2.getResources().getXml(i);
        try {
            Object[] objArr = r6.A03;
            synchronized (objArr) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                objArr[0] = context2;
                do {
                    try {
                        next = xml.next();
                        if (next == 2) {
                            preferenceGroup = (PreferenceGroup) r6.A00(asAttributeSet, xml.getName());
                            if (preferenceScreen == null) {
                                preferenceGroup.A0K(r6.A00);
                            } else {
                                preferenceGroup = preferenceScreen;
                            }
                            r6.A02(asAttributeSet, preferenceGroup, xml);
                        }
                    } catch (InflateException e) {
                        throw e;
                    } catch (XmlPullParserException e2) {
                        e = e2;
                        inflateException = new InflateException(e.getMessage());
                        inflateException.initCause(e);
                        throw inflateException;
                    } catch (IOException e3) {
                        e = e3;
                        inflateException = new InflateException(AnonymousClass000.A0a(": ", AnonymousClass000.A0n(xml), e));
                        inflateException.initCause(e);
                        throw inflateException;
                    }
                } while (next != 1);
                throw new InflateException(AnonymousClass000.A0X(": No start tag found!", AnonymousClass000.A0n(xml)));
            }
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroup;
            preferenceScreen2.A0K(this);
            SharedPreferences.Editor editor = this.A02;
            if (editor != null) {
                editor.apply();
            }
            this.A09 = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public SharedPreferences.Editor A00() {
        if (!this.A09) {
            return A01().edit();
        }
        SharedPreferences.Editor editor = this.A02;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = A01().edit();
        this.A02 = edit;
        return edit;
    }

    public SharedPreferences A01() {
        SharedPreferences sharedPreferences = this.A03;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = this.A01.getSharedPreferences(this.A08, 0);
        this.A03 = sharedPreferences2;
        return sharedPreferences2;
    }

    public AnonymousClass0Pz(Context context) {
        this.A01 = context;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(context.getPackageName());
        this.A08 = AnonymousClass000.A0X("_preferences", A0o);
        this.A03 = null;
    }
}
