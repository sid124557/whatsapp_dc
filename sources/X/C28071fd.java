package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1fd  reason: invalid class name and case insensitive filesystem */
public class C28071fd extends C622534h {
    public long A00 = -1;
    public final C111095hX A01;

    public C28071fd(C111095hX r11, C159027ky r12, C56972sr r13, C620633i r14, C56612sH r15, C54292oU r16, AnonymousClass33p r17, AnonymousClass1VX r18) {
        super(r12, r13, r14, r15, r16, r17, r18);
        this.A01 = r11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        if (r7 >= 702000000) goto L_0x00c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.content.Context r18, java.lang.String r19, java.lang.String r20, double r21, double r23) {
        /*
            r17 = this;
            java.lang.String r10 = "android.intent.action.VIEW"
            r3 = r23
            r5 = r21
            r12 = r19
            r13 = r20
            r11 = r18
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ ActivityNotFoundException -> 0x008c }
            r2.append(r5)     // Catch:{ ActivityNotFoundException -> 0x008c }
            java.lang.String r1 = ","
            r2.append(r1)     // Catch:{ ActivityNotFoundException -> 0x008c }
            r2.append(r3)     // Catch:{ ActivityNotFoundException -> 0x008c }
            java.lang.String r0 = "?q="
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r2)     // Catch:{ ActivityNotFoundException -> 0x008c }
            if (r20 == 0) goto L_0x003b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            java.lang.String r0 = java.net.URLEncoder.encode(r13, r0)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            goto L_0x004c
        L_0x0035:
            java.lang.String r0 = "app/failed-url-encode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ ActivityNotFoundException -> 0x008c }
            goto L_0x004c
        L_0x003b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r2)     // Catch:{ ActivityNotFoundException -> 0x008c }
            r0.append(r5)     // Catch:{ ActivityNotFoundException -> 0x008c }
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x008c }
            r0.append(r3)     // Catch:{ ActivityNotFoundException -> 0x008c }
            java.lang.String r2 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x008c }
        L_0x004c:
            if (r19 == 0) goto L_0x0070
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r2)     // Catch:{ UnsupportedEncodingException -> 0x006a }
            java.lang.String r0 = "("
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006a }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ UnsupportedEncodingException -> 0x006a }
            java.lang.String r0 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x006a }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006a }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x006a }
            java.lang.String r2 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r1 = move-exception
            java.lang.String r0 = "LocationUtils/failed-url-encode"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ ActivityNotFoundException -> 0x008c }
        L_0x0070:
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ ActivityNotFoundException -> 0x008c }
            r1.<init>()     // Catch:{ ActivityNotFoundException -> 0x008c }
            java.lang.String r0 = "geo"
            android.net.Uri$Builder r0 = r1.scheme(r0)     // Catch:{ ActivityNotFoundException -> 0x008c }
            android.net.Uri$Builder r0 = r0.encodedOpaquePart(r2)     // Catch:{ ActivityNotFoundException -> 0x008c }
            android.net.Uri r1 = r0.build()     // Catch:{ ActivityNotFoundException -> 0x008c }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x008c }
            r0.<init>(r10, r1)     // Catch:{ ActivityNotFoundException -> 0x008c }
            r11.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x008c }
            return
        L_0x008c:
            r14 = r17
            X.5hX r9 = r14.A01
            long r7 = r14.A00
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            java.lang.String r2 = "com.google.android.apps.maps"
            long r7 = X.AnonymousClass345.A00(r11, r2)
            r14.A00 = r7
            r15 = -1
            int r2 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x00aa
            r14.A00 = r0
            r7 = 0
        L_0x00aa:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.text.DecimalFormatSymbols r0 = java.text.DecimalFormatSymbols.getInstance(r0)
            char r1 = r0.getDecimalSeparator()
            r0 = 44
            if (r1 != r0) goto L_0x00c9
            r1 = 700000000(0x29b92700, double:3.45845952E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c9
            r1 = 702000000(0x29d7ab80, double:3.468340834E-315)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r8 = 1
            if (r0 < 0) goto L_0x00ca
        L_0x00c9:
            r8 = 0
        L_0x00ca:
            java.lang.String r7 = "maps"
            java.lang.String r2 = "maps.google.com"
            java.lang.String r1 = "https"
            java.lang.String r15 = ","
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            android.net.Uri$Builder r0 = r0.scheme(r1)
            android.net.Uri$Builder r0 = r0.authority(r2)
            android.net.Uri$Builder r14 = r0.path(r7)
            if (r8 == 0) goto L_0x0116
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "q=loc:("
            r1.append(r0)
            r1.append(r5)
            r1.append(r15)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            android.net.Uri$Builder r2 = r14.encodedQuery(r0)
            java.lang.String r1 = "z"
            java.lang.String r0 = "16"
            android.net.Uri$Builder r14 = r2.appendQueryParameter(r1, r0)
        L_0x0109:
            android.net.Uri r1 = r14.build()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r10, r1)
            r9.A0A(r11, r0)
            return
        L_0x0116:
            java.lang.String r8 = ")"
            java.lang.String r7 = "("
            java.lang.String r2 = ""
            java.lang.String r1 = "q"
            if (r20 == 0) goto L_0x014b
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r13)
            if (r19 == 0) goto L_0x012b
            java.lang.String r2 = X.C18260x0.A06(r7, r12, r8)
        L_0x012b:
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r0)
            android.net.Uri$Builder r2 = r14.appendQueryParameter(r1, r0)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            r0.append(r5)
            r0.append(r15)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "sll"
            r2.appendQueryParameter(r0, r1)
            goto L_0x0109
        L_0x014b:
            java.lang.StringBuilder r13 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "loc:"
            r13.append(r0)
            r13.append(r5)
            r13.append(r15)
            r13.append(r3)
            if (r19 == 0) goto L_0x0163
            java.lang.String r2 = X.C18260x0.A06(r7, r12, r8)
        L_0x0163:
            java.lang.String r0 = X.AnonymousClass000.A0X(r2, r13)
            r14.appendQueryParameter(r1, r0)
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28071fd.A08(android.content.Context, java.lang.String, java.lang.String, double, double):void");
    }

    public void A06(Activity activity, C95814uZ r7) {
        String str;
        boolean A05 = A05(activity);
        Context applicationContext = activity.getApplicationContext();
        String rawString = r7.getRawString();
        Intent A07 = C18320x8.A07();
        A07.putExtra("jid", rawString);
        A07.putExtra("mode", 3);
        String packageName = applicationContext.getPackageName();
        if (A05) {
            str = "com.whatsapp.location.LocationPicker2";
        } else {
            str = "com.whatsapp.location.LocationPicker";
        }
        A07.setClassName(packageName, str);
        activity.startActivityForResult(A07, 100);
    }

    public void A07(Context context, C95814uZ r7, UserJid userJid) {
        String str;
        boolean A05 = A05(context);
        String rawString = r7.getRawString();
        String A07 = C627336j.A07(userJid);
        Intent A072 = C18320x8.A07();
        A072.putExtra("jid", rawString);
        A072.putExtra("target", A07);
        String packageName = context.getPackageName();
        if (A05) {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity2";
        } else {
            str = "com.whatsapp.location.GroupChatLiveLocationsActivity";
        }
        A072.setClassName(packageName, str);
        context.startActivity(A072);
    }
}
