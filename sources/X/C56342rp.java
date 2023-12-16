package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2rp  reason: invalid class name and case insensitive filesystem */
public abstract class C56342rp {
    public SharedPreferences A00;
    public final C55682qk A01;
    public final AnonymousClass4DO A02;
    public final C60152y5 A03;
    public final String A04;

    public final synchronized SharedPreferences A00() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A03(this.A04);
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public Object A01(UserJid userJid) {
        if ((this instanceof AnonymousClass1kA) || (this instanceof AnonymousClass1k9) || (this instanceof AnonymousClass1k8) || !(this instanceof AnonymousClass1k7)) {
            C162457s7.A0J(userJid, 0);
        }
        String string = A00().getString(userJid.getRawString(), (String) null);
        if (string != null) {
            try {
                return this.A02.B3Z(string);
            } catch (C376323k e) {
                A04(e, "getObject");
                A03(userJid);
            }
        }
        return null;
    }

    public void A03(UserJid userJid) {
        if ((this instanceof AnonymousClass1kA) || (this instanceof AnonymousClass1k9) || (this instanceof AnonymousClass1k8) || !(this instanceof AnonymousClass1k7)) {
            C162457s7.A0J(userJid, 0);
        }
        C18270x1.A0n(A00(), userJid.getRawString());
    }

    public void A05(Object obj) {
        String str;
        UserJid userJid;
        try {
            if (this instanceof AnonymousClass1kA) {
                C53212mj r1 = (C53212mj) obj;
                C162457s7.A0J(r1, 0);
                userJid = r1.A02;
            } else if (this instanceof AnonymousClass1k9) {
                C54692p8 r12 = (C54692p8) obj;
                C162457s7.A0J(r12, 0);
                userJid = r12.A03;
            } else if (this instanceof AnonymousClass1k8) {
                C51512jw r13 = (C51512jw) obj;
                C162457s7.A0J(r13, 0);
                userJid = r13.A00;
            } else if (this instanceof AnonymousClass1k7) {
                userJid = ((C22901Qn) obj).A00;
            } else if (this instanceof AnonymousClass1k6) {
                C22901Qn r14 = (C22901Qn) obj;
                C162457s7.A0J(r14, 0);
                userJid = r14.A00;
            } else {
                C60712z2 r15 = (C60712z2) obj;
                C162457s7.A0J(r15, 0);
                str = r15.A02;
                C18270x1.A0j(A00().edit(), str, this.A02.Bqn(obj));
            }
            str = userJid.getRawString();
            C18270x1.A0j(A00().edit(), str, this.A02.Bqn(obj));
        } catch (C376323k e) {
            A04(e, "saveObject");
        }
    }

    public C56342rp(C55682qk r1, AnonymousClass4DO r2, C60152y5 r3, String str) {
        this.A01 = r1;
        this.A03 = r3;
        this.A04 = str;
        this.A02 = r2;
    }

    public List A02() {
        ArrayList A0s = AnonymousClass001.A0s();
        Map<String, ?> all = A00().getAll();
        Iterator A0q = AnonymousClass000.A0q(all);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            String A0q2 = C18310x6.A0q(A0w);
            Object obj = all.get(A0q2);
            if (obj != null) {
                try {
                    A0s.add(this.A02.B3Z(obj.toString()));
                } catch (C376323k e) {
                    A04(e, "getAllObjects");
                    C18270x1.A0n(A00(), A0q2);
                }
            } else {
                C18260x0.A1Q(AnonymousClass001.A0o(), "JidKeyedSharedPreferencesStore/getAllEntryPoints/ null pref value for key=", A0w);
            }
        }
        return A0s;
    }

    public void A04(C376323k r5, String str) {
        String A0a = AnonymousClass000.A0a("/", AnonymousClass000.A0l(str), r5);
        C18260x0.A0u("JidKeyedSharedPreferencesStore/", A0a, C55682qk.A03(this.A01, "JidKeyedSharedPreferencesStoreTransformationException", A0a, true), r5);
    }
}
