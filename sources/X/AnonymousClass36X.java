package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.36X  reason: invalid class name */
public final class AnonymousClass36X {
    public static final C108895dj A01(C49312gK r2, String str) {
        C162457s7.A0J(str, 0);
        return AnonymousClass0x7.A0a(AnonymousClass3QD.A00(), String.class, r2.A01(str), "XfamilyStatusUniqueId");
    }

    public static final boolean A08(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (C18300x5.A0T(it).A0J <= 0) {
                return false;
            }
        }
        return true;
    }

    public static final String A03(Integer num) {
        if (num == null) {
            return "other";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "auto_xpost_status_share_view";
        }
        if (intValue == 2) {
            return "auto_xpost_audience_selector_view";
        }
        if (intValue == 3) {
            return "contextual_share_icon";
        }
        if (intValue == 4) {
            return "contextual_share_upsell_banner_setup_link";
        }
        if (intValue == 5) {
            return "status_list_single_status_share_to_fb_menu";
        }
        if (intValue == 6) {
            return "status_list_single_status_long_press_share_to_fb_menu";
        }
        if (intValue == 7) {
            return "status_list_multiple_statuses_share_to_fb_menu";
        }
        if (intValue == 8) {
            return "status_detail_share_to_fb_menu";
        }
        if (intValue == 9) {
            return "auto_xpost_retry";
        }
        if (intValue == 10) {
            return "xpost_retry";
        }
        return "other";
    }

    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder A0H;
        C18260x0.A0O(context, charSequence);
        SpannableStringBuilder A00 = C18330xA.A00(context.getString(R.string.f11nameremoved));
        A04(A00, charSequence, "%1$s");
        Drawable A002 = AnonymousClass0RP.A00(context, R.drawable.ic_settings_fb);
        if (A002 == null) {
            A0H = new SpannableStringBuilder();
        } else {
            A0H = AnonymousClass0x7.A0H(context, A002, i, i2);
        }
        A04(A00, A0H, "%2$s");
        return A00;
    }

    public static final String A02() {
        String A0Y = C18280x3.A0Y();
        C162457s7.A0D(A0Y);
        StringBuilder A0o = AnonymousClass001.A0o();
        int length = A0Y.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = A0Y.charAt(i2);
            A0o.append(charAt);
            if (charAt == '-' && (i = i + 1) == 2) {
                A0o.append("waffle-");
            }
        }
        return C18290x4.A0o(A0o);
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        X.AnonymousClass2A8.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C69263Wi r8, X.C29161iN r9, X.C183538qC r10, java.util.List r11) {
        /*
            java.lang.Object r6 = r10.get()
            X.30J r6 = (X.AnonymousClass30J) r6
            java.lang.String r0 = "("
            java.lang.StringBuilder r3 = X.C18330xA.A0A(r0)
            int r2 = r11.size()
            r1 = 0
        L_0x0011:
            if (r1 >= r2) goto L_0x0020
            if (r1 <= 0) goto L_0x0018
            X.C18320x8.A1K(r3)
        L_0x0018:
            java.lang.String r0 = "?"
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0020:
            java.lang.String r7 = X.AnonymousClass000.A0e(r3)
            X.C162457s7.A0D(r7)
            X.2oy r0 = r6.A01
            r0.A01()
            r0.A01()
            X.0i7 r5 = r0.A00
            monitor-enter(r5)
            java.util.Iterator r4 = r11.iterator()     // Catch:{ all -> 0x009e }
        L_0x0036:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0055
            long r1 = X.C18270x1.A02(r4)     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "[XFAM] XFamilyStatusCrosspostStateCache/[REMOVAL ALL]messageRowId: "
            r3.append(r0)     // Catch:{ all -> 0x009e }
            r3.append(r1)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = " removed"
            X.C18260x0.A1J(r3, r0)     // Catch:{ all -> 0x009e }
            r5.A08(r1)     // Catch:{ all -> 0x009e }
            goto L_0x0036
        L_0x0055:
            monitor-exit(r5)
            X.3dV r0 = r6.A00
            X.4Fq r6 = r0.A04()
            r0 = r6
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0097 }
            X.2sg r5 = r0.A03     // Catch:{ all -> 0x0097 }
            java.lang.String r4 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r3 = X.AnonymousClass000.A0V(r0, r7, r1)     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r2 = X.C73783g4.A0c(r11)     // Catch:{ all -> 0x0097 }
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x0097 }
        L_0x0077:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0081
            X.C18270x1.A1M(r2, r1)     // Catch:{ all -> 0x0097 }
            goto L_0x0077
        L_0x0081:
            java.lang.String[] r1 = X.C18300x5.A1b(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/DELETE_RECORDS_BY_MESSAGE_ROW_IDS"
            r5.A07(r4, r3, r0, r1)     // Catch:{ all -> 0x0097 }
            r6.close()
            r1 = 7
            X.3a3 r0 = new X.3a3
            r0.<init>(r11, r1, r9)
            r8.A0S(r0)
            return
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r6, r1)
            throw r0
        L_0x009e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36X.A05(X.3Wi, X.1iN, X.8qC, java.util.List):void");
    }

    public static final void A06(C69263Wi r2, C29161iN r3, C183538qC r4, List list, int i) {
        ((AnonymousClass30J) r4.get()).A04(list, i);
        r2.A0S(new C70163a3(list, 8, r3));
    }

    public static final boolean A07(C624134x r2) {
        AnonymousClass2z0 A07 = C624134x.A07(r2);
        if (!(A07.A00 instanceof C135166kE) || !A07.A02) {
            return false;
        }
        if ((r2 instanceof C30481mW) || (r2 instanceof C31971pB) || (r2 instanceof AnonymousClass1n2) || (r2 instanceof C31961pA) || (r2 instanceof C30721mu)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        for (Object obj : collection) {
            if (obj instanceof C30721mu) {
                return true;
            }
        }
        return false;
    }
}
