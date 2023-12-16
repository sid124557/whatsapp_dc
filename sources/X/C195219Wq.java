package X;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9Wq  reason: invalid class name and case insensitive filesystem */
public class C195219Wq {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C56422rx A02;
    public final AnonymousClass5ZU A03;
    public final C56612sH A04;
    public final C54292oU A05;
    public final C620733j A06;
    public final C56892sj A07;
    public final C617332a A08;
    public final AnonymousClass1VX A09;
    public final C620933l A0A;
    public final C153087ae A0B;
    public final C1907099n A0C;
    public final AnonymousClass9U4 A0D;
    public final C385127z A0E;
    public final C160757oG A0F = C160757oG.A00("PaymentsUtils", "infra", "COMMON");

    public static String A07(int i, int i2) {
        if (i == 1) {
            return "main_camera";
        }
        if (i != 3) {
            if (i == 4) {
                return "payments_camera";
            }
            return "unknown";
        } else if (i2 == 1) {
            return "chat_attachment_gallery";
        } else {
            if (i2 == 10) {
                return "main_camera_gallery";
            }
            if (i2 == 13 || i2 == 21) {
                return "chat_camera_gallery";
            }
            if (i2 == 33) {
                return "photo_received";
            }
            if (i2 == 34) {
                return "photo_received_gallery";
            }
            return "unknown";
        }
    }

    public static void A09(Context context, CharSequence charSequence, int i) {
        String string = context.getString(R.string.f11nameremoved);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        builder.setMessage(charSequence);
        if (string != null) {
            builder.setPositiveButton(string, (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }

    public int A0C(C95814uZ r8) {
        C1907099n r4 = this.A0C;
        if (!C1899693i.A0x(r4)) {
            return 0;
        }
        C56972sr r3 = this.A00;
        if (r3.A0a(r8) || (r8 instanceof AnonymousClass1fS)) {
            return 0;
        }
        if (!C627336j.A0K(r8)) {
            return r4.A05(AnonymousClass32Y.A03(r8));
        }
        r4.A04.A02();
        int i = 4;
        C172878Nf it = this.A07.A09.A07((C28011fL) r8).A04().iterator();
        while (it.hasNext()) {
            UserJid userJid = ((C60842zG) it.next()).A03;
            if (!r3.A0a(userJid)) {
                i = 3;
                if (r4.A05(userJid) == 2) {
                    return 4;
                }
            }
        }
        return i;
    }

    public CharSequence A0J(Context context, int i) {
        C85204Fi r1;
        if (i == 1) {
            PhoneUserJid A042 = C56972sr.A04(this.A00);
            C626936e.A06(A042);
            r1 = C161357pU.A00(C161357pU.A01(C621333r.A02(AnonymousClass36P.A06(A042))).A03).A02;
        } else if (i != 3) {
            return null;
        } else {
            r1 = AnonymousClass1S3.A05;
        }
        return ((AnonymousClass1S3) r1).B6J(context, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0O(X.AnonymousClass1S4 r2, X.C95814uZ r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r3 == 0) goto L_0x0008
            java.lang.String r0 = A08(r3, r1, r4)     // Catch:{ all -> 0x0011 }
            goto L_0x000f
        L_0x0008:
            if (r2 == 0) goto L_0x0014
            r0 = 1
            java.lang.String r0 = r1.A0P(r2, r0)     // Catch:{ all -> 0x0011 }
        L_0x000f:
            monitor-exit(r1)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0014:
            monitor-exit(r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0O(X.1S4, X.4uZ, boolean):java.lang.String");
    }

    public synchronized String A0T(C624034w r2) {
        return A0Z(r2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (r3 != 1000) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0U(X.C624034w r8) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x001d
            X.3Ex r0 = r7.A01     // Catch:{ all -> 0x0094 }
            X.3ZH r5 = r0.A0A(r1)     // Catch:{ all -> 0x0094 }
        L_0x000c:
            X.2oU r0 = r7.A05     // Catch:{ all -> 0x0094 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0094 }
            r0 = 2131894600(0x7f122148, float:1.942401E38)
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            int r3 = r8.A03     // Catch:{ all -> 0x0094 }
            r1 = 1
            if (r3 == r1) goto L_0x001f
            goto L_0x0036
        L_0x001d:
            r5 = 0
            goto L_0x000c
        L_0x001f:
            if (r5 == 0) goto L_0x0028
            X.5ZU r0 = r7.A03     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0M(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0028:
            X.1S4 r0 = r8.A0A     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r7.A0P(r0, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0050
        L_0x0034:
            monitor-exit(r6)
            return r0
        L_0x0036:
            r0 = 2
            if (r3 == r0) goto L_0x008a
            r0 = 3
            if (r3 == r0) goto L_0x0052
            r0 = 10
            if (r3 == r0) goto L_0x008a
            r0 = 20
            if (r3 == r0) goto L_0x001f
            r0 = 100
            if (r3 == r0) goto L_0x001f
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x008a
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r0) goto L_0x005b
        L_0x0050:
            monitor-exit(r6)
            return r4
        L_0x0052:
            if (r5 == 0) goto L_0x005b
            X.5ZU r0 = r7.A03     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0M(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x005b:
            X.2sr r1 = r7.A00     // Catch:{ all -> 0x0092 }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x0092 }
            boolean r0 = r1.A0a(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006d
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x006d:
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0078
            X.3Ex r0 = r7.A01     // Catch:{ all -> 0x0092 }
            X.3ZH r1 = r0.A0A(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x0082
            X.5ZU r0 = r7.A03     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = r0.A0M(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x0082:
            r0 = 2131894600(0x7f122148, float:1.942401E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x008a:
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0092:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0U(X.34w):java.lang.String");
    }

    public synchronized String A0V(C624034w r4) {
        AnonymousClass3ZH r2;
        String str;
        C626936e.A0C(r4.A0L());
        UserJid userJid = r4.A0E;
        if (userJid != null) {
            r2 = this.A01.A0A(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            AnonymousClass1S4 r0 = r4.A0A;
            if (r0 != null) {
                str = A0P(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A05.A00.getString(R.string.f11nameremoved);
            }
        } else if (this.A00.A0a(r2.A0H)) {
            str = this.A05.A00.getString(R.string.f11nameremoved);
        } else {
            str = this.A03.A0M(r2);
        }
        return str;
    }

    public synchronized String A0W(C624034w r4) {
        AnonymousClass3ZH r2;
        String str;
        C626936e.A0C(r4.A0L());
        UserJid userJid = r4.A0D;
        if (userJid != null) {
            r2 = this.A01.A0A(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            AnonymousClass1S4 r0 = r4.A0A;
            if (r0 != null) {
                str = A0P(r0, true);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A05.A00.getString(R.string.f11nameremoved);
            }
        } else if (this.A00.A0a(r2.A0H)) {
            str = this.A05.A00.getString(R.string.f11nameremoved);
        } else {
            str = this.A03.A0M(r2);
        }
        return str;
    }

    public synchronized String A0X(C624034w r3) {
        AnonymousClass3ZH r1;
        String str;
        UserJid userJid = r3.A0E;
        if (userJid != null) {
            r1 = this.A01.A0A(userJid);
        } else {
            r1 = null;
        }
        if (r1 != null) {
            str = this.A03.A0M(r1);
        } else {
            AnonymousClass1S4 r0 = r3.A0A;
            if (r0 != null) {
                str = A0P(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A05.A00.getString(R.string.f11nameremoved);
            }
        }
        return str;
    }

    public synchronized String A0Y(C624034w r7, C624134x r8) {
        String str;
        C64773Ex r1 = this.A01;
        UserJid A0o = r8.A0o();
        C626936e.A06(A0o);
        AnonymousClass3ZH A0A2 = r1.A0A(A0o);
        if (r8 instanceof C30831nH) {
            boolean z = r8.A1J.A02;
            int i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
            if (r7.A08 == null) {
                i = R.string.f11nameremoved;
                if (z) {
                    i = R.string.f11nameremoved;
                }
            }
            Context context = this.A05.A00;
            Object[] A0M = AnonymousClass002.A0M();
            A0M[0] = this.A03.A0H(A0A2);
            str = AnonymousClass002.A0F(context, A0R(r7), A0M, 1, i);
        } else if (r8 instanceof AnonymousClass1nG) {
            boolean z2 = r8.A1J.A02;
            int i2 = R.string.f11nameremoved;
            if (z2) {
                i2 = R.string.f11nameremoved;
            }
            if (r7.A08 == null) {
                i2 = R.string.f11nameremoved;
                if (z2) {
                    i2 = R.string.f11nameremoved;
                }
            }
            Context context2 = this.A05.A00;
            Object[] A0M2 = AnonymousClass002.A0M();
            A0M2[0] = this.A03.A0H(A0A2);
            str = AnonymousClass002.A0F(context2, A0R(r7), A0M2, 1, i2);
        } else {
            throw AnonymousClass001.A0e(C160757oG.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        if (r0 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r0 = r3.A05.A00.getString(com.whatsapp.R.string.f11nameremoved);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0Z(X.C624034w r4, boolean r5) {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            int r1 = r4.A03     // Catch:{ all -> 0x00aa }
            r0 = 20
            if (r1 == r0) goto L_0x0090
            r0 = 30
            if (r1 == r0) goto L_0x0068
            r0 = 40
            if (r1 == r0) goto L_0x0090
            r0 = 100
            if (r1 == r0) goto L_0x0090
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0055
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x0068
            switch(r1) {
                case 1: goto L_0x0090;
                case 2: goto L_0x0055;
                case 3: goto L_0x0068;
                case 4: goto L_0x0068;
                case 5: goto L_0x0068;
                case 6: goto L_0x002a;
                case 7: goto L_0x0036;
                case 8: goto L_0x0049;
                case 9: goto L_0x0020;
                case 10: goto L_0x0055;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x00aa }
        L_0x001f:
            goto L_0x009e
        L_0x0020:
            r1 = 0
            X.1S4 r0 = r4.A0A     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r3.A0P(r0, r1)     // Catch:{ all -> 0x00aa }
            goto L_0x009a
        L_0x002a:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x00aa }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00aa }
            r0 = 2131891848(0x7f121688, float:1.9418428E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x0036:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x00aa }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00aa }
            X.9U4 r0 = r3.A0D     // Catch:{ all -> 0x00aa }
            X.9oC r0 = r0.A0G()     // Catch:{ all -> 0x00aa }
            int r0 = r0.BAp()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x0049:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x00aa }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00aa }
            r0 = 2131891849(0x7f121689, float:1.941843E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x0055:
            com.whatsapp.jid.UserJid r0 = r4.A0E     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = A08(r0, r3, r5)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x005e:
            r1 = 0
            X.1S4 r0 = r4.A0A     // Catch:{ all -> 0x00aa }
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = r3.A0P(r0, r1)     // Catch:{ all -> 0x00aa }
            goto L_0x009a
        L_0x0068:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0082
            com.whatsapp.jid.UserJid r0 = r4.A0E     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0082
            X.2sr r0 = r3.A00     // Catch:{ all -> 0x008e }
            boolean r0 = r0.A0a(r1)     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x007f
            com.whatsapp.jid.UserJid r0 = r4.A0E     // Catch:{ all -> 0x008e }
        L_0x007a:
            java.lang.String r0 = A08(r0, r3, r5)     // Catch:{ all -> 0x008e }
            goto L_0x009c
        L_0x007f:
            com.whatsapp.jid.UserJid r0 = r4.A0D     // Catch:{ all -> 0x008e }
            goto L_0x007a
        L_0x0082:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x008e }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x008e }
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x008e }
            goto L_0x009c
        L_0x008e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x0090:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00aa }
            X.1S4 r0 = r4.A0A     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r3.A0O(r0, r1, r5)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x009e
        L_0x009c:
            monitor-exit(r2)
            return r0
        L_0x009e:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x00aa }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00aa }
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00aa }
            goto L_0x009c
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0Z(X.34w, boolean):java.lang.String");
    }

    public boolean A0s(C95814uZ r6) {
        if (r6 != null) {
            String str = r6.user;
            try {
                JSONArray jSONArray = new JSONArray(this.A09.A0Q(2462));
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsUtils/isMessageBusinessSupported: Unable to parse allowed_message_merchants");
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = r6.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0t(X.C95814uZ r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x002e
            X.1VX r2 = r6.A09
            r0 = 2435(0x983, float:3.412E-42)
            java.lang.String r1 = r2.A0Q(r0)
            if (r1 == 0) goto L_0x002e
            r0 = 2221(0x8ad, float:3.112E-42)
            boolean r0 = r2.A0X(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)
            java.lang.String r3 = r7.user
            int r2 = r4.length
            r1 = 0
        L_0x001f:
            if (r1 >= r2) goto L_0x002e
            r0 = r4[r1]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            int r1 = r1 + 1
            goto L_0x001f
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0t(X.4uZ):boolean");
    }

    public static int A00(C161357pU r3) {
        C85204Fi r1;
        int i;
        boolean z;
        if (r3 != null) {
            LinkedHashSet linkedHashSet = r3.A05;
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C85204Fi r12 = (C85204Fi) it.next();
                if (((AnonymousClass3H6) r12).A00 == 0) {
                    if (r12 != null) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                r1 = null;
                                break;
                            }
                            r1 = (C85204Fi) it2.next();
                            if (((AnonymousClass3H6) r1).A00 == 0) {
                                break;
                            }
                        }
                        String str = ((AnonymousClass3H6) r1).A04;
                        switch (str.hashCode()) {
                            case 66044:
                                z = str.equals("BRL");
                                i = R.drawable.ic_attachment_payment_brl;
                                break;
                            case 70916:
                                z = str.equals("GTQ");
                                i = R.drawable.ic_attachment_payment_gtq;
                                break;
                            case 72653:
                                z = str.equals("INR");
                                i = R.drawable.ic_attachment_payment_inr;
                                break;
                            case 84326:
                                z = str.equals("USD");
                                i = R.drawable.ic_attachment_payment_usd;
                                break;
                        }
                        if (!z) {
                            return 0;
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    public static int A01(C624034w r1) {
        int i = r1.A02;
        if (i == 802 || i == 804 || i == 902 || i == 904 || i == 906 || i == 908) {
            return R.color.f5nameremoved;
        }
        switch (i) {
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
                return R.color.f5nameremoved;
            case 13:
            case 14:
                return R.color.f5nameremoved;
            case 17:
                return R.color.f5nameremoved;
            default:
                switch (i) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 109:
                    case 112:
                        return R.color.f5nameremoved;
                    case 105:
                    case 107:
                    case C627136h.A03:
                    case 110:
                    case 111:
                        return R.color.f5nameremoved;
                    case 106:
                        return R.color.f5nameremoved;
                    default:
                        switch (i) {
                            case 401:
                            case 402:
                            case 403:
                            case 410:
                            case 415:
                            case 417:
                            case 418:
                                return R.color.f5nameremoved;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 416:
                                return R.color.f5nameremoved;
                            case 405:
                                return R.color.f5nameremoved;
                            default:
                                switch (i) {
                                    case 420:
                                    case 421:
                                        return R.color.f5nameremoved;
                                    case 422:
                                    case 423:
                                    case 424:
                                        return R.color.f5nameremoved;
                                    default:
                                        switch (i) {
                                            case 601:
                                            case 602:
                                            case 603:
                                            case 606:
                                            case 607:
                                            case 608:
                                                return R.color.f5nameremoved;
                                            case 604:
                                                return R.color.f5nameremoved;
                                            case 605:
                                                return R.color.f5nameremoved;
                                            default:
                                                switch (i) {
                                                    case 703:
                                                        return R.color.f5nameremoved;
                                                    case 704:
                                                        return R.color.f5nameremoved;
                                                    default:
                                                        return R.color.f5nameremoved;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static Resources A02(C195219Wq r0) {
        return r0.A05.A00.getResources();
    }

    public static Drawable A03(Context context, C85204Fi r6, int i, int i2) {
        return new AnonymousClass4Lm(C06400Xn.A02(context, R.font.payment_icons_regular), ((AnonymousClass1S3) r6).B6J(context, 0), context.getResources().getColor(i), context.getResources().getDimensionPixelSize(i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return X.AnonymousClass9JQ.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return X.AnonymousClass9JQ.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return X.AnonymousClass9JQ.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9JQ A04(X.C624034w r0) {
        /*
            int r0 = r0.A02
            switch(r0) {
                case 11: goto L_0x0014;
                case 12: goto L_0x0014;
                case 13: goto L_0x0017;
                case 14: goto L_0x0017;
                case 15: goto L_0x0014;
                case 16: goto L_0x0014;
                case 17: goto L_0x001a;
                case 18: goto L_0x0014;
                case 19: goto L_0x0014;
                case 20: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            switch(r0) {
                case 101: goto L_0x0014;
                case 102: goto L_0x0014;
                case 103: goto L_0x0014;
                case 104: goto L_0x0014;
                case 105: goto L_0x0017;
                case 106: goto L_0x001a;
                case 107: goto L_0x0017;
                case 108: goto L_0x0017;
                case 109: goto L_0x0014;
                case 110: goto L_0x0017;
                case 111: goto L_0x0017;
                case 112: goto L_0x0014;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r0) {
                case 401: goto L_0x0014;
                case 402: goto L_0x0014;
                case 403: goto L_0x0014;
                case 404: goto L_0x0017;
                case 405: goto L_0x001a;
                case 406: goto L_0x0017;
                case 407: goto L_0x0017;
                case 408: goto L_0x0017;
                case 409: goto L_0x0017;
                case 410: goto L_0x0014;
                case 411: goto L_0x0017;
                case 412: goto L_0x0017;
                case 413: goto L_0x0017;
                case 414: goto L_0x0017;
                case 415: goto L_0x0014;
                case 416: goto L_0x0017;
                case 417: goto L_0x0014;
                case 418: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r0) {
                case 420: goto L_0x0014;
                case 421: goto L_0x0014;
                case 422: goto L_0x0017;
                case 423: goto L_0x0017;
                case 424: goto L_0x0017;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 601: goto L_0x0014;
                case 602: goto L_0x0014;
                case 603: goto L_0x0014;
                case 604: goto L_0x001a;
                case 605: goto L_0x0017;
                case 606: goto L_0x0014;
                case 607: goto L_0x0014;
                case 608: goto L_0x0014;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r0) {
                case 703: goto L_0x001a;
                case 704: goto L_0x0017;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.9JQ r0 = X.AnonymousClass9JQ.PENDING_ICON
            return r0
        L_0x0017:
            X.9JQ r0 = X.AnonymousClass9JQ.FAILED_ICON
            return r0
        L_0x001a:
            X.9JQ r0 = X.AnonymousClass9JQ.SUCCESS_ICON
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A04(X.34w):X.9JQ");
    }

    public static String A06(int i) {
        if (i == 0) {
            return "native";
        }
        if (i == 6) {
            return "pix";
        }
        if (i == 2) {
            return "cpi";
        }
        if (i != 3) {
            return null;
        }
        return "confirm";
    }

    public static String A08(C95814uZ r1, C195219Wq r2, int i) {
        AnonymousClass3ZH A0A2 = r2.A01.A0A(r1);
        AnonymousClass5ZU r0 = r2.A03;
        if (i != 0) {
            return r0.A0M(A0A2);
        }
        return r0.A0H(A0A2);
    }

    public static boolean A0A(AnonymousClass1VX r1, AnonymousClass39S r2) {
        if (!r1.A0X(6710) || r2 == null || !"quick_pay".equals(r2.A07.A08)) {
            return false;
        }
        return true;
    }

    public int A0B(C624034w r4) {
        int i = r4.A02;
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 11:
                return R.string.f11nameremoved;
            case 12:
            case 20:
                return R.string.f11nameremoved;
            case 13:
            case 14:
                return R.string.f11nameremoved;
            case 15:
                return R.string.f11nameremoved;
            case 16:
                return R.string.f11nameremoved;
            case 17:
                return R.string.f11nameremoved;
            case 18:
                return R.string.f11nameremoved;
            case 19:
                if (r4.A03 == 10) {
                    return R.string.f11nameremoved;
                }
                return R.string.f11nameremoved;
            default:
                switch (i) {
                    case 101:
                    case 103:
                    case 104:
                    case 109:
                    case 113:
                    case 114:
                        return R.string.f11nameremoved;
                    case 102:
                    case 110:
                    case 115:
                        return R.string.f11nameremoved;
                    case 105:
                    case C627136h.A03:
                    case 111:
                        return R.string.f11nameremoved;
                    case 106:
                        return R.string.f11nameremoved;
                    case 107:
                        return R.string.f11nameremoved;
                    case 112:
                        return R.string.f11nameremoved;
                    default:
                        switch (i) {
                            case 401:
                            case 403:
                            case 410:
                            case 420:
                                return R.string.f11nameremoved;
                            case 402:
                            case 419:
                            case 425:
                                return R.string.f11nameremoved;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 422:
                            case 423:
                            case 424:
                                return R.string.f11nameremoved;
                            case 405:
                                return R.string.f11nameremoved;
                            case 415:
                            case 421:
                                return R.string.f11nameremoved;
                            case 416:
                                return R.string.f11nameremoved;
                            case 417:
                                return this.A0D.A0G().BCS(r4);
                            case 418:
                                return R.string.f11nameremoved;
                            default:
                                switch (i) {
                                    case 601:
                                    case 602:
                                        return R.string.f11nameremoved;
                                    case 603:
                                        return R.string.f11nameremoved;
                                    case 604:
                                        return R.string.f11nameremoved;
                                    case 605:
                                        return R.string.f11nameremoved;
                                    case 606:
                                        return R.string.f11nameremoved;
                                    case 607:
                                        return R.string.f11nameremoved;
                                    case 608:
                                        return R.string.f11nameremoved;
                                    default:
                                        switch (i) {
                                            case 701:
                                                return R.string.f11nameremoved;
                                            case 702:
                                                return R.string.f11nameremoved;
                                            case 703:
                                                return R.string.f11nameremoved;
                                            case 704:
                                                return R.string.f11nameremoved;
                                            case 705:
                                                return R.string.f11nameremoved;
                                            default:
                                                switch (i) {
                                                    case 801:
                                                    case 803:
                                                        return R.string.f11nameremoved;
                                                    case 802:
                                                    case 804:
                                                        return R.string.f11nameremoved;
                                                    default:
                                                        switch (i) {
                                                            case 901:
                                                            case 905:
                                                                return R.string.f11nameremoved;
                                                            case 902:
                                                            case 904:
                                                            case 906:
                                                            case 908:
                                                                return R.string.f11nameremoved;
                                                            case 903:
                                                                return R.string.f11nameremoved;
                                                            case 907:
                                                                return R.string.f11nameremoved;
                                                            default:
                                                                return R.string.f11nameremoved;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public int A0D(AnonymousClass39H r3) {
        if ("pending".equals(r3.A01) && "PAYMENT_REQUEST".equals(r3.A08)) {
            AnonymousClass1VX r1 = this.A0C.A02;
            if (r1.A0X(5575) || r1.A0X(5574)) {
                return 7;
            }
        }
        return AnonymousClass39S.A00(r3.A01);
    }

    public Pair A0E(long j) {
        Integer valueOf;
        C620733j r1;
        int i;
        if (j <= 0) {
            return null;
        }
        int i2 = (int) (j / 86400000);
        if (i2 > 0) {
            valueOf = Integer.valueOf(i2);
            r1 = this.A06;
            i = 3;
        } else {
            i2 = (int) (j / 3600000);
            if (i2 > 0) {
                valueOf = Integer.valueOf(i2);
                r1 = this.A06;
                i = 2;
            } else {
                i2 = (int) (j / 60000);
                if (i2 <= 0) {
                    return null;
                }
                valueOf = Integer.valueOf(i2);
                r1 = this.A06;
                i = 1;
            }
        }
        return AnonymousClass0x9.A0C(valueOf, C107565bW.A05(r1, i2, i));
    }

    public Pair A0G(C624134x r7) {
        C624034w r5;
        Context context;
        int i;
        String A0X;
        Context context2;
        int i2;
        if (r7.A1J.A00 == null || (r5 = r7.A0P) == null) {
            return new Pair("", "");
        }
        boolean A0L = r5.A0L();
        String str = "";
        C56972sr r1 = this.A00;
        if (A0L) {
            if (!r1.A0a(r5.A0E) || "en".equals(this.A06.A07())) {
                str = A0V(r5);
                context = this.A05.A00;
                i = R.string.f11nameremoved;
                A0X = AnonymousClass0x2.A0X(context, str, 1, i);
                return AnonymousClass0x9.A0C(str, A0X);
            }
            context2 = this.A05.A00;
            i2 = R.string.f11nameremoved;
        } else if (!r1.A0a(r5.A0D) || "en".equals(this.A06.A07())) {
            str = A0U(r5);
            context = this.A05.A00;
            i = R.string.f11nameremoved;
            A0X = AnonymousClass0x2.A0X(context, str, 1, i);
            return AnonymousClass0x9.A0C(str, A0X);
        } else {
            context2 = this.A05.A00;
            i2 = R.string.f11nameremoved;
        }
        A0X = context2.getString(i2);
        return AnonymousClass0x9.A0C(str, A0X);
    }

    public C141946wO A0H(AnonymousClass39S r7) {
        C151007Tb A002 = this.A0D.A0C("p2p_context").A00();
        if (A002 != null) {
            String str = A002.A03;
            if (str.equals("unset") || str.equals("tos_with_wallet") || str.equals("tos_no_wallet")) {
                boolean A0L = this.A0C.A0L(r7.A0D, r7.A0K);
                C620933l r4 = this.A0A;
                boolean z = r4.A03().getBoolean("pref_p2m_hybrid_tos_accepted", false);
                if (A0L) {
                    if (!r4.A03().getBoolean("pref_p2m_hybrid_v2_tos_accepted", false)) {
                        if (z) {
                            return C141946wO.TOS_V2;
                        }
                        return C141946wO.TOS_ALL;
                    }
                } else if (!z) {
                    return C141946wO.TOS_V1;
                }
            }
        }
        return C141946wO.TOS_NONE;
    }

    public C193359Oe A0I(Context context, C95814uZ r5, boolean z) {
        String A0M = this.A03.A0M(this.A01.A0A(r5));
        if (this.A0C.A02()) {
            this.A0D.A0G().BAy();
        }
        int i = R.string.f11nameremoved;
        if (z) {
            i = R.string.f11nameremoved;
        }
        return new C193359Oe(A0M, C86604Kt.A0m(context, A0M, i));
    }

    public Long A0K(C624034w r5) {
        AnonymousClass1S4 r0 = r5.A0A;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(r0.A0B() - this.A04.A0H());
    }

    public String A0L() {
        return this.A05.A00.getString(R.string.f11nameremoved);
    }

    public final String A0M(long j, int i) {
        C620733j r2;
        String str = "";
        if (j > 0) {
            long j2 = 86400000;
            int i2 = (int) (j / 86400000);
            if (i2 > 0) {
                r2 = this.A06;
                str = C107565bW.A05(r2, i2, 3);
            } else {
                j2 = 3600000;
                int i3 = (int) (j / 3600000);
                if (i3 > 0) {
                    r2 = this.A06;
                    str = C107565bW.A05(r2, i3, 2);
                } else {
                    int i4 = (int) (j / 60000);
                    if (i4 > 0) {
                        return C107565bW.A05(this.A06, i4, 1);
                    }
                }
            }
            long j3 = j % j2;
            if (!(i == 1 || j3 == 0)) {
                return r2.A0D(244, str, A0M(j3, 1));
            }
        }
        return str;
    }

    public String A0N(C85204Fi r2, AnonymousClass39Q r3) {
        return r2.B3V(this.A06, r3);
    }

    public final String A0P(AnonymousClass1S4 r5, boolean z) {
        C166557yt A0H;
        boolean z2;
        if (z) {
            A0H = r5.A0G();
        } else {
            A0H = r5.A0H();
        }
        String str = (String) C1899593h.A0X(A0H);
        if (str != null) {
            if (!C107575bX.A0F(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(this.A09.A0Q(1940));
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        } else if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                            z2 = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                } catch (JSONException unused) {
                    Log.e("PaymentsUtils failed to parse json in abprop");
                }
            }
            z2 = true;
            if (z2) {
                return str;
            }
        }
        if (z) {
            return r5.A0L();
        }
        return r5.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r1 != 200) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0Q(X.C624034w r22) {
        /*
            r21 = this;
            r9 = r21
            X.7oG r3 = r9.A0F
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "getStatusChangeNotifStringWithoutMessage status:"
            r1.append(r0)
            r2 = r22
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r2.A03
            X.C1899593h.A1K(r3, r1, r0)
            X.39Q r0 = r2.A08
            r3 = 1
            if (r0 != 0) goto L_0x0106
            r15 = 1
        L_0x0024:
            X.39Q r0 = r2.A08
            if (r0 != 0) goto L_0x0100
            X.2oU r0 = r9.A05
            android.content.Context r1 = r0.A00
            r0 = 2131894597(0x7f122145, float:1.9424003E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x0033:
            int r1 = r2.A03
            r7 = 0
            if (r1 == r3) goto L_0x0185
            r8 = 2
            if (r1 == r8) goto L_0x0168
            r0 = 9
            if (r1 == r0) goto L_0x0152
            r0 = 10
            java.lang.String r5 = ""
            if (r1 == r0) goto L_0x00cc
            r0 = 20
            if (r1 == r0) goto L_0x0052
            r0 = 100
            if (r1 == r0) goto L_0x0185
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0168
        L_0x0051:
            return r5
        L_0x0052:
            int r1 = r2.A02
            r0 = 12
            if (r1 != r0) goto L_0x0051
            X.9U4 r1 = r9.A0D
            X.9oC r0 = r1.A0G()
            X.9RF r0 = r0.B5e()
            if (r0 == 0) goto L_0x0051
            X.9oC r0 = r1.A0G()
            X.9RF r5 = r0.B5e()
            boolean r0 = r5 instanceof X.C1907199o
            com.whatsapp.jid.UserJid r1 = r2.A0D
            if (r0 == 0) goto L_0x010e
            if (r1 == 0) goto L_0x0082
            X.3Ex r0 = r5.A00
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r5.A01
            java.lang.String r3 = r0.A0M(r1)
            if (r3 != 0) goto L_0x00a8
        L_0x0082:
            X.1S4 r0 = r2.A0A
            if (r0 == 0) goto L_0x009d
            X.7yt r0 = r0.A0G()
            boolean r1 = X.C161527pr.A02(r0)
            X.1S4 r0 = r2.A0A
            if (r1 != 0) goto L_0x00bb
            X.7yt r0 = r0.A0G()
            java.lang.Object r3 = r0.A00
            X.C626936e.A06(r3)
        L_0x009b:
            if (r3 != 0) goto L_0x00a8
        L_0x009d:
            X.2oU r0 = r5.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894600(0x7f122148, float:1.942401E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x00a8:
            X.2oU r0 = r5.A02
            android.content.Context r2 = r0.A00
            r1 = 2131887812(0x7f1206c4, float:1.9410242E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r3, r4, r0)
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x00bb:
            java.lang.String r0 = r0.A0L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009d
            X.1S4 r0 = r2.A0A
            java.lang.String r3 = r0.A0L()
            goto L_0x009b
        L_0x00cc:
            int r1 = r2.A02
            r0 = 13
            if (r1 == r0) goto L_0x00f8
            r0 = 14
            if (r1 == r0) goto L_0x00f8
            r0 = 16
            if (r1 != r0) goto L_0x00ec
            X.2oU r0 = r9.A05
            android.content.Context r5 = r0.A00
            r4 = 2131892053(0x7f121755, float:1.9418843E38)
        L_0x00e1:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = r9.A0X(r2)
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r0, r1, r7, r4)
            return r0
        L_0x00ec:
            r0 = 15
            if (r1 != r0) goto L_0x0051
            X.2oU r0 = r9.A05
            android.content.Context r5 = r0.A00
            r4 = 2131892055(0x7f121757, float:1.9418847E38)
            goto L_0x00e1
        L_0x00f8:
            X.2oU r0 = r9.A05
            android.content.Context r5 = r0.A00
            r4 = 2131892054(0x7f121756, float:1.9418845E38)
            goto L_0x00e1
        L_0x0100:
            java.lang.String r4 = r9.A0R(r2)
            goto L_0x0033
        L_0x0106:
            java.math.BigDecimal r0 = r0.A00
            int r15 = r0.intValue()
            goto L_0x0024
        L_0x010e:
            if (r1 == 0) goto L_0x011e
            X.3Ex r0 = r5.A00
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r5.A01
            java.lang.String r3 = r0.A0M(r1)
            if (r3 != 0) goto L_0x013f
        L_0x011e:
            X.1S4 r0 = r2.A0A
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = r0.A0L()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0134
            X.1S4 r0 = r2.A0A
            java.lang.String r3 = r0.A0L()
            if (r3 != 0) goto L_0x013f
        L_0x0134:
            X.2oU r0 = r5.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894600(0x7f122148, float:1.942401E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x013f:
            X.2oU r0 = r5.A02
            android.content.Context r2 = r0.A00
            r1 = 2131892056(0x7f121758, float:1.941885E38)
            java.lang.Object[] r0 = X.AnonymousClass002.A0M()
            X.AnonymousClass000.A16(r3, r4, r0)
            java.lang.String r0 = r2.getString(r1, r0)
            return r0
        L_0x0152:
            android.content.res.Resources r6 = A02(r9)
            r5 = 2131755273(0x7f100109, float:1.914142E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = r9.A0X(r2)
            r1[r7] = r0
            r1[r3] = r4
            java.lang.String r0 = r6.getQuantityString(r5, r15, r1)
            return r0
        L_0x0168:
            android.content.res.Resources r6 = A02(r9)
            r5 = 2131755270(0x7f100106, float:1.9141415E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A0X(r2)
            r1[r7] = r0
            r1[r3] = r4
            java.lang.String r0 = r9.A0U(r2)
            r1[r8] = r0
            java.lang.String r0 = r6.getQuantityString(r5, r15, r1)
            return r0
        L_0x0185:
            java.lang.String r10 = r9.A0U(r2)
            java.lang.String r11 = r9.A0X(r2)
            int r13 = r2.A02
            X.1S4 r0 = r2.A0A
            if (r0 != 0) goto L_0x01a5
            r14 = 0
        L_0x0194:
            r16 = 0
            long r0 = r2.A06
            java.lang.String r12 = r9.A0R(r2)
            r18 = r0
            r20 = r3
            java.lang.String r0 = r9.A0i(r10, r11, r12, r13, r14, r15, r16, r18, r20)
            return r0
        L_0x01a5:
            int r14 = r0.A08()
            goto L_0x0194
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0Q(X.34w):java.lang.String");
    }

    public final String A0S(C624034w r6) {
        boolean A0a = this.A00.A0a(r6.A0D);
        C54292oU r0 = this.A05;
        if (A0a) {
            return r0.A00.getString(R.string.f11nameremoved);
        }
        return AnonymousClass002.A0F(r0.A00, A0U(r6), AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
    }

    public String A0a(C203549nv r8, C624134x r9) {
        Context context;
        int i;
        long j;
        String str;
        Context context2;
        int i2;
        if (!AnonymousClass36S.A06(r9.A0P)) {
            C624034w r3 = r9.A0P;
            int i3 = r3.A02;
            if (i3 != 12) {
                if (i3 != 102) {
                    if (i3 != 105) {
                        if (i3 != 402) {
                            if (i3 == 406 || i3 == 407) {
                                String str2 = r3.A0J;
                                if (!(str2 == null || r8 == null)) {
                                    int A012 = C615531h.A01(str2, -1);
                                    if (r8.BJ9(A012) || r8.BHp(A012) || r8.BHt(A012)) {
                                        context2 = this.A05.A00;
                                        i2 = R.string.f11nameremoved;
                                    } else if (r8.BHo(A012)) {
                                        int BB4 = this.A0D.A0G().BB4();
                                        Context context3 = this.A05.A00;
                                        return AnonymousClass0x2.A0X(context3, context3.getString(BB4), 1, R.string.f11nameremoved);
                                    } else if (r8.BHn(A012)) {
                                        context2 = this.A05.A00;
                                        i2 = R.string.f11nameremoved;
                                    } else if (r8.BI7(A012)) {
                                        int BB42 = this.A0D.A0G().BB4();
                                        Context context4 = this.A05.A00;
                                        return AnonymousClass002.A0F(context4, context4.getString(BB42), new Object[1], 0, R.string.f11nameremoved);
                                    }
                                    return r8.B7P(context2.getString(i2), A012);
                                }
                            } else {
                                if (i3 != 420) {
                                    if (i3 != 421) {
                                        switch (i3) {
                                            case C627136h.A03:
                                                break;
                                            case 109:
                                                context = this.A05.A00;
                                                i = R.string.f11nameremoved;
                                                break;
                                            case 110:
                                                context = this.A05.A00;
                                                i = R.string.f11nameremoved;
                                                break;
                                            case 111:
                                                context = this.A05.A00;
                                                i = R.string.f11nameremoved;
                                                break;
                                            case 112:
                                                break;
                                        }
                                    }
                                    context = this.A05.A00;
                                    i = R.string.f11nameremoved;
                                } else {
                                    context = this.A05.A00;
                                    i = R.string.f11nameremoved;
                                }
                                return context.getString(i);
                            }
                        }
                    }
                    String str3 = r3.A0J;
                    if (!(str3 == null || r8 == null || !r8.BIZ(C615531h.A01(str3, -1)))) {
                        context = this.A05.A00;
                        i = R.string.f11nameremoved;
                        return context.getString(i);
                    }
                }
                Long A0K = A0K(r3);
                if (A0K == null) {
                    return "";
                }
                j = A0K.longValue();
                int i4 = 2;
                if (j <= 86400000) {
                    i4 = 1;
                }
                str = A0M(j, i4);
            } else {
                int i5 = r3.A03;
                if (i5 == 10 || i5 == 20) {
                    Long A0K2 = A0K(r3);
                    if (A0K2 == null) {
                        return "";
                    }
                    j = A0K2.longValue();
                    Pair A0E2 = A0E(j);
                    if (A0E2 == null) {
                        str = null;
                    } else {
                        str = (String) A0E2.second;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return A02(this).getQuantityString(R.plurals.f9nameremoved, 1, AnonymousClass6C9.A1Z(str, 1));
            }
            int i6 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            context = this.A05.A00;
            i = R.string.f11nameremoved;
            if (i6 > 0) {
                i = R.string.f11nameremoved;
            }
            return context.getString(i);
        }
        return null;
    }

    public String A0d(C624134x r5) {
        String str = "";
        C624034w r2 = r5.A0P;
        if (r2 == null) {
            return str;
        }
        if (r2.A03 == 1000) {
            return A0S(r2);
        }
        if (!TextUtils.isEmpty(r2.A0I)) {
            C624034w r1 = r5.A0P;
            if (r1.A08 != null) {
                str = r1.A03().B3U(this.A06, r5.A0P.A08);
            }
        }
        if (r5 instanceof AnonymousClass1nE) {
            return AnonymousClass000.A0X(this.A05.A00.getString(R.string.f11nameremoved), AnonymousClass000.A0m(str, " • "));
        } else if (r5.A1I != 0 || TextUtils.isEmpty(r5.A13())) {
            return str;
        } else {
            return AnonymousClass000.A0X(r5.A13(), AnonymousClass000.A0m(str, " • "));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012a, code lost:
        if (r19 == false) goto L_0x012c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0e(X.C624134x r18, boolean r19) {
        /*
            r17 = this;
            r3 = r17
            monitor-enter(r3)
            r2 = r18
            X.34w r1 = r2.A0P     // Catch:{ all -> 0x022c }
            r16 = 0
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1W(r1)
            X.C626936e.A0C(r0)     // Catch:{ all -> 0x022c }
            X.39Q r0 = r1.A08     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x006a
            java.math.BigDecimal r0 = r0.A00     // Catch:{ all -> 0x022c }
            int r4 = r0.intValue()     // Catch:{ all -> 0x022c }
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            java.lang.String r6 = r3.A0R(r0)     // Catch:{ all -> 0x022c }
        L_0x0021:
            X.2sr r1 = r3.A00     // Catch:{ all -> 0x022c }
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            com.whatsapp.jid.UserJid r0 = r0.A0E     // Catch:{ all -> 0x022c }
            boolean r15 = r1.A0a(r0)     // Catch:{ all -> 0x022c }
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            com.whatsapp.jid.UserJid r0 = r0.A0D     // Catch:{ all -> 0x022c }
            boolean r14 = r1.A0a(r0)     // Catch:{ all -> 0x022c }
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            boolean r0 = r0.A0L()     // Catch:{ all -> 0x022c }
            r10 = 3
            r5 = 2
            if (r0 == 0) goto L_0x00d6
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            java.lang.String r8 = r3.A0W(r0)     // Catch:{ all -> 0x022c }
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            java.lang.String r7 = r3.A0V(r0)     // Catch:{ all -> 0x022c }
            X.7oG r11 = r3.A0F     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x022c }
            java.lang.String r0 = "payment request: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            X.2z0 r0 = r2.A1J     // Catch:{ all -> 0x022c }
            r1.append(r0)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = " requester: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            r1.append(r8)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = " requestee: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            X.C1899593h.A1J(r11, r7, r1)     // Catch:{ all -> 0x022c }
            goto L_0x0077
        L_0x006a:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x022c }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x022c }
            r0 = 2131894597(0x7f122145, float:1.9424003E38)
            java.lang.String r6 = r1.getString(r0)     // Catch:{ all -> 0x022c }
            r4 = 1
            goto L_0x0021
        L_0x0077:
            if (r19 != 0) goto L_0x009d
            if (r15 == 0) goto L_0x008c
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755268(0x7f100104, float:1.914141E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x022c }
            r0[r16] = r6     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x008c:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755267(0x7f100103, float:1.9141408E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r6, r7, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x009d:
            if (r14 == 0) goto L_0x00b0
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755265(0x7f100101, float:1.9141404E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r6, r7, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x00b0:
            if (r15 == 0) goto L_0x00c3
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755266(0x7f100102, float:1.9141406E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x00c3:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755264(0x7f100100, float:1.9141402E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r10)     // Catch:{ all -> 0x022c }
            r0[r5] = r7     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x00d6:
            X.2z0 r12 = r2.A1J     // Catch:{ all -> 0x022c }
            X.4uZ r7 = r12.A00     // Catch:{ all -> 0x022c }
            if (r7 == 0) goto L_0x00f9
            X.4uZ r1 = r2.A0n()     // Catch:{ all -> 0x022c }
            boolean r0 = X.C627336j.A0K(r7)     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x00e9
            if (r1 == 0) goto L_0x00e9
            r7 = r1
        L_0x00e9:
            X.5ZU r1 = r3.A03     // Catch:{ all -> 0x022c }
            X.3Ex r0 = r3.A01     // Catch:{ all -> 0x022c }
            X.C626936e.A06(r7)     // Catch:{ all -> 0x022c }
            X.3ZH r0 = r0.A0A(r7)     // Catch:{ all -> 0x022c }
            java.lang.String r8 = r1.A0M(r0)     // Catch:{ all -> 0x022c }
            goto L_0x00ff
        L_0x00f9:
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            java.lang.String r8 = r3.A0X(r0)     // Catch:{ all -> 0x022c }
        L_0x00ff:
            X.34w r0 = r2.A0P     // Catch:{ all -> 0x022c }
            java.lang.String r7 = r3.A0U(r0)     // Catch:{ all -> 0x022c }
            X.7oG r11 = r3.A0F     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x022c }
            java.lang.String r0 = "payment message: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            r1.append(r12)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = " sender: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            r1.append(r8)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = " receiver: "
            r1.append(r0)     // Catch:{ all -> 0x022c }
            X.C1899593h.A1J(r11, r7, r1)     // Catch:{ all -> 0x022c }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x022c }
            if (r0 != 0) goto L_0x012c
            r13 = 0
            if (r19 != 0) goto L_0x012d
        L_0x012c:
            r13 = 1
        L_0x012d:
            X.34w r11 = r2.A0P     // Catch:{ all -> 0x022c }
            int r2 = r11.A03     // Catch:{ all -> 0x022c }
            if (r2 == r5) goto L_0x0137
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L_0x01a8
        L_0x0137:
            int r1 = r11.A02     // Catch:{ all -> 0x022c }
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x01a8
            java.lang.Long r0 = r3.A0K(r11)     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0155
            long r0 = r0.longValue()     // Catch:{ all -> 0x022c }
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r7 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r2 = 2
            if (r7 > 0) goto L_0x0150
            r2 = 1
        L_0x0150:
            java.lang.String r7 = r3.A0M(r0, r2)     // Catch:{ all -> 0x022c }
            goto L_0x0156
        L_0x0155:
            r7 = 0
        L_0x0156:
            if (r13 == 0) goto L_0x0180
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x016f
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755274(0x7f10010a, float:1.9141423E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x022c }
            r0[r16] = r6     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x016f:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131892160(0x7f1217c0, float:1.941906E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r6, r7, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x0180:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x022c }
            if (r0 == 0) goto L_0x0197
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755277(0x7f10010d, float:1.9141429E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x0197:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131892161(0x7f1217c1, float:1.9419062E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r10)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = X.C18320x8.A0b(r2, r7, r0, r5, r1)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01a8:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r0) goto L_0x01d1
            if (r13 == 0) goto L_0x01b3
            java.lang.String r0 = r3.A0S(r11)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01b3:
            if (r14 == 0) goto L_0x01c1
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x022c }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x022c }
            r0 = 2131891713(0x7f121601, float:1.9418154E38)
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r1, r8, r9, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01c1:
            X.2oU r0 = r3.A05     // Catch:{ all -> 0x022c }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x022c }
            r1 = 2131891714(0x7f121602, float:1.9418156E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x022c }
            r0[r16] = r8     // Catch:{ all -> 0x022c }
            java.lang.String r0 = X.AnonymousClass002.A0F(r2, r7, r0, r9, r1)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01d1:
            if (r13 == 0) goto L_0x01f5
            if (r14 == 0) goto L_0x01e5
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755276(0x7f10010c, float:1.9141427E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x022c }
            r0[r16] = r6     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01e5:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755275(0x7f10010b, float:1.9141425E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r6, r7, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x01f5:
            if (r15 == 0) goto L_0x0207
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755271(0x7f100107, float:1.9141417E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r6, r7, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x0207:
            if (r14 == 0) goto L_0x0219
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755272(0x7f100108, float:1.9141419E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r5)     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
            goto L_0x022a
        L_0x0219:
            android.content.res.Resources r2 = A02(r3)     // Catch:{ all -> 0x022c }
            r1 = 2131755270(0x7f100106, float:1.9141415E38)
            java.lang.Object[] r0 = X.AnonymousClass4L0.A0V(r8, r6, r10)     // Catch:{ all -> 0x022c }
            r0[r5] = r7     // Catch:{ all -> 0x022c }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x022c }
        L_0x022a:
            monitor-exit(r3)
            return r0
        L_0x022c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0e(X.34x, boolean):java.lang.String");
    }

    public String A0g(String str) {
        return C86604Kt.A0m(this.A05.A00, str, R.string.f11nameremoved);
    }

    public final String A0h(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j) {
        int i12 = i10;
        long j2 = j;
        if (j <= 0) {
            return AnonymousClass0x2.A0X(this.A05.A00, str, 1, i);
        }
        int A002 = C107175ap.A00(this.A04.A0H(), j2);
        if (A002 == 0) {
            return AnonymousClass0x2.A0X(this.A05.A00, str, 1, i2);
        }
        if (A002 == 1) {
            return AnonymousClass0x2.A0X(this.A05.A00, str, 1, i3);
        }
        if (A002 < 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            switch (instance.get(7)) {
                case 1:
                    break;
                case 2:
                    i12 = i4;
                    break;
                case 3:
                    i12 = i5;
                    break;
                case 4:
                    i12 = i6;
                    break;
                case 5:
                    i12 = i7;
                    break;
                case 6:
                    i12 = i8;
                    break;
                case 7:
                    i12 = i9;
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return AnonymousClass0x2.A0X(this.A05.A00, str, 1, i12);
        }
        return AnonymousClass002.A0F(this.A05.A00, C86624Kv.A0c(C107505bQ.A08(this.A06), j2), C18310x6.A1b(str, 0), 1, i11);
    }

    public String A0i(String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        Object[] objArr;
        String str4 = str3;
        int i5 = i;
        long j3 = j;
        if (z) {
            String str5 = str;
            if (i5 == 406 || i5 == 407 || i5 == 412) {
                return A0h(str5, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, j3);
            }
            if (i5 == 408 || i5 == 404 || i5 == 411) {
                return A0h(str5, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, j2);
            }
            if (i5 == 409) {
                int i6 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Context context = this.A05.A00;
                if (i6 > 0) {
                    i4 = R.string.f11nameremoved;
                    objArr = new Object[]{str, AnonymousClass002.A0F(context, C107505bQ.A03(this.A06, j3), new Object[1], 0, R.string.f11nameremoved)};
                } else {
                    i4 = R.string.f11nameremoved;
                    objArr = new Object[]{str};
                }
                return context.getString(i4, objArr);
            } else if (i5 == 421) {
                Context context2 = this.A05.A00;
                Object[] objArr2 = new Object[2];
                objArr2[0] = str;
                return AnonymousClass002.A0F(context2, str4, objArr2, 1, R.string.f11nameremoved);
            }
        } else {
            String str6 = str2;
            if (i5 == 102) {
                return A02(this).getQuantityString(R.plurals.f9nameremoved, i3, AnonymousClass4L0.A0V(str6, str4, 2));
            } else if (i5 == 106) {
                int i7 = i2;
                if (i7 == 104 || i7 == 103 || i7 == 102) {
                    return A0h(str6, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved, j3);
                }
            } else if (i5 == 420) {
                return this.A05.A00.getString(R.string.f11nameremoved);
            } else {
                if (i5 == 112) {
                    Context context3 = this.A05.A00;
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = str2;
                    return AnonymousClass002.A0F(context3, str4, objArr3, 1, R.string.f11nameremoved);
                }
            }
        }
        return "";
    }

    public void A0j() {
        this.A0C.A04.A02();
    }

    public void A0k(View view, AnonymousClass3ZH r7) {
        C88694ab.A01(view, AnonymousClass002.A0F(this.A05.A00, this.A03.A0M(r7), AnonymousClass002.A0L(), 0, R.string.f11nameremoved), 0).A05();
    }

    public boolean A0l() {
        return this.A0C.A0B();
    }

    public boolean A0m() {
        return this.A0D.A0G().BIH();
    }

    public boolean A0n() {
        return A0u(C56972sr.A04(this.A00));
    }

    public boolean A0o(Context context, UserJid userJid, int i) {
        if (this.A00.A0Y() || i == 0) {
            return false;
        }
        if (userJid != null) {
            C56422rx r0 = this.A02;
            C55502qS A002 = r0.A00(userJid);
            if (r0.A03(userJid)) {
                return false;
            }
            if (A002 != null && A002.A03() && C161357pU.A0F == this.A0B.A02()) {
                return this.A09.A0X(5415);
            }
        }
        C85204Fi A012 = this.A0B.A01();
        if (A012 == null || TextUtils.isEmpty(((AnonymousClass1S3) A012).B6J(context, 0))) {
            return false;
        }
        return true;
    }

    public boolean A0p(C624034w r4) {
        if (r4.A03 == 1 && r4.A02 == 402 && this.A00.A0a(r4.A0E)) {
            return true;
        }
        return false;
    }

    public boolean A0q(C624034w r5, C195069Vt r6, C203549nv r7, int i) {
        int i2;
        int A012 = C615531h.A01(r5.A0J, -1);
        int i3 = r5.A03;
        if (i3 != 1 && i3 != 100) {
            return false;
        }
        AnonymousClass1S4 r0 = r5.A0A;
        if ((r0 != null && r0.A02 != null && (!this.A0C.A0C() || r6 == null)) || !this.A00.A0a(r5.A0E) || !r5.A0G() || (i2 = r5.A02) == 419 || i2 == 420 || i2 == 409) {
            return false;
        }
        if (i2 != 405) {
            if (i2 == 407 || i2 == 0) {
                return false;
            }
        } else if (!(r5.A03 == 1 && this.A0C.A02.A0X(2381) && i == 1)) {
            return false;
        }
        if (A012 == 441 || A012 == 410 || A012 == 11455 || A012 == 2826008) {
            return false;
        }
        if (r7 == null || r7.BoX(A012)) {
            return true;
        }
        return false;
    }

    public boolean A0r(C624034w r4, AnonymousClass39S r5) {
        if (this.A0C.A0K(r5.A0D)) {
            if (r4 == null || !r4.A0G()) {
                return false;
            }
        } else if (!TextUtils.isEmpty(r5.A04) || (!TextUtils.isEmpty(r5.A02) && !"pending_buyer_confirmation".equals(r5.A03))) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public boolean A0u(C95814uZ r2) {
        return AnonymousClass001.A1T(this.A0C.A04(r2));
    }

    public boolean A0v(UserJid userJid) {
        C56972sr r3 = this.A00;
        String A022 = C621333r.A02(AnonymousClass36P.A06(C56972sr.A04(r3)));
        if (A022 == null || !A0w(C56972sr.A04(r3), userJid, A022) || A0C(userJid) != 2) {
            return false;
        }
        return true;
    }

    public boolean A0x(AnonymousClass39S r4) {
        AnonymousClass39G r1;
        if (!this.A09.A0X(6012) || (r1 = r4.A09) == null || r4.A01 == null) {
            return false;
        }
        if (r4.A01.A02.A00.compareTo(r4.A03(r1).A02.A00) < 0) {
            return true;
        }
        return false;
    }

    public C195219Wq(C56972sr r4, C64773Ex r5, C56422rx r6, AnonymousClass5ZU r7, C56612sH r8, C54292oU r9, C620733j r10, C56892sj r11, C617332a r12, AnonymousClass1VX r13, C620933l r14, C153087ae r15, C1907099n r16, AnonymousClass9U4 r17, C385127z r18) {
        this.A05 = r9;
        this.A04 = r8;
        this.A09 = r13;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r7;
        this.A06 = r10;
        this.A0D = r17;
        this.A0A = r14;
        this.A02 = r6;
        this.A0C = r16;
        this.A0E = r18;
        this.A08 = r12;
        this.A0B = r15;
        this.A07 = r11;
    }

    public static CharSequence A05(Context context, C624034w r3) {
        C85204Fi A032 = r3.A03();
        if (A032 != AnonymousClass1S3.A06) {
            return A032.B6J(context, r3.A0L() ? 1 : 0);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        if (r2 != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0F(X.C624034w r9) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A0V(r9)
            java.lang.String r6 = r8.A0W(r9)
            X.33j r0 = r8.A06
            java.lang.String r1 = r0.A07()
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r1)
            X.2sr r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r9.A0D
            boolean r0 = r1.A0a(r0)
            r5 = 0
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0038
            if (r2 != 0) goto L_0x0038
            X.2oU r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131892062(0x7f12175e, float:1.9418862E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
        L_0x002f:
            java.lang.String r0 = r2.getString(r1, r0)
            android.util.Pair r0 = X.AnonymousClass0x9.A0C(r3, r0)
            return r0
        L_0x0038:
            com.whatsapp.jid.UserJid r0 = r9.A0E
            boolean r0 = r1.A0a(r0)
            if (r0 == 0) goto L_0x004e
            if (r2 != 0) goto L_0x0050
            X.2oU r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131892061(0x7f12175d, float:1.941886E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            goto L_0x002f
        L_0x004e:
            if (r2 == 0) goto L_0x0051
        L_0x0050:
            r3 = r6
        L_0x0051:
            X.2oU r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131892060(0x7f12175c, float:1.9418858E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r6, r5)
            r0[r4] = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195219Wq.A0F(X.34w):android.util.Pair");
    }

    public String A0R(C624034w r4) {
        if (AnonymousClass36S.A06(r4) || TextUtils.isEmpty(r4.A0I) || r4.A08 == null) {
            return "";
        }
        return r4.A03().B3V(this.A06, r4.A08);
    }

    public String A0b(AnonymousClass39S r4) {
        boolean A0x = A0x(r4);
        C620733j r2 = this.A06;
        if (!A0x) {
            return r4.A05(r2);
        }
        if (r4.A01 == null) {
            return null;
        }
        C85204Fi r1 = r4.A06;
        C626936e.A06(r1);
        return r1.B3W(r2, r4.A01.A02.A00);
    }

    public String A0c(AnonymousClass39S r6) {
        String str;
        if (r6.A04() != null) {
            str = r6.A04();
        } else {
            str = "";
        }
        C1907099n r2 = this.A0C;
        String str2 = r6.A0D;
        List list = r6.A0K;
        if (r2.A0L(str2, list) && list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass394 r22 = (AnonymousClass394) it.next();
                if ("payment_gateway".equals(r22.A01)) {
                    AnonymousClass3SO r0 = (AnonymousClass3SO) r22.A00;
                    if (r0 != null) {
                        String str3 = r0.A00;
                        if (!TextUtils.isEmpty(str3)) {
                            return str3;
                        }
                    }
                }
            }
        }
        return str;
    }

    public String A0f(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            if (split.length == 2) {
                C85204Fi A012 = this.A08.A01(split[0]);
                try {
                    return A012.B3V(this.A06, C1899593h.A08(A012, new BigDecimal(split[1]).movePointLeft(3)));
                } catch (NumberFormatException unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public boolean A0w(UserJid userJid, UserJid userJid2, String str) {
        String A022 = C621333r.A02(AnonymousClass36P.A06(userJid));
        String A023 = C621333r.A02(AnonymousClass36P.A06(userJid2));
        if (A022 == null || A023 == null || !A022.equals(str) || !A022.equals(A023)) {
            return false;
        }
        return true;
    }
}
