package com.whatsapp.registration.autoconf;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass33p;
import X.AnonymousClass35C;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18320x8;
import X.C18530xp;
import X.C54292oU;
import X.C56972sr;
import X.C58422vE;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

public final class LoginStatusContentProvider extends C18530xp {
    public C56972sr A00;
    public C54292oU A01;
    public AnonymousClass33p A02;
    public AnonymousClass1VX A03;

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        boolean A0P;
        C162457s7.A0J(str, 0);
        Log.i("LoginStatusContentProvider/call");
        A08();
        String callingPackage = getCallingPackage();
        C18260x0.A0s("LoginStatusContentProvider/call/callingPackage=", callingPackage, AnonymousClass001.A0o());
        if (callingPackage == null) {
            str3 = "LoginStatusContentProvider/call/null callingPackage";
        } else {
            Context context = getContext();
            if (context == null) {
                str3 = "LoginStatusContentProvider/call/null context";
            } else if (Binder.getCallingUid() == Process.myUid() || AnonymousClass35C.A03(context, callingPackage)) {
                AnonymousClass33p r0 = this.A02;
                if (r0 != null) {
                    if (r0.A01() >= 2) {
                        AnonymousClass1VX r2 = this.A03;
                        if (r2 == null) {
                            throw C18270x1.A0R();
                        } else if (r2.A0Y(C58422vE.A02, 4667)) {
                            if (!str.equals("login_status_check")) {
                                str3 = "LoginStatusContentProvider/call/incorrect method";
                            } else if (str2 == null) {
                                str3 = "LoginStatusContentProvider/call/null arg received";
                            } else {
                                C56972sr r02 = this.A00;
                                if (r02 != null) {
                                    Me A002 = C56972sr.A00(r02);
                                    if (A002 == null) {
                                        A0P = false;
                                    } else {
                                        A0P = C162457s7.A0P(AnonymousClass000.A0T(A002.cc, A002.number), str2);
                                    }
                                    C18260x0.A1E("LoginStatusContentProvider/call/loginStatus=", AnonymousClass001.A0o(), A0P);
                                    Bundle A08 = AnonymousClass002.A08();
                                    A08.putBoolean("result", A0P);
                                    return A08;
                                }
                                throw C18270x1.A0S("meManager");
                            }
                        }
                    }
                    str3 = "LoginStatusContentProvider/call/maac2 not enabled";
                } else {
                    throw C18270x1.A0S("waSharedPreferences");
                }
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Caller ");
                A0o.append(callingPackage);
                throw new SecurityException(AnonymousClass000.A0X(" is not trusted", A0o));
            }
        }
        Log.e(str3);
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw C18320x8.A0m();
    }

    public String getType(Uri uri) {
        throw C18320x8.A0m();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw C18320x8.A0m();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw C18320x8.A0m();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18320x8.A0m();
    }
}
