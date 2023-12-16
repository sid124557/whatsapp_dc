package X;

/* renamed from: X.2XP  reason: invalid class name */
public final class AnonymousClass2XP {
    public C69263Wi A00;
    public C183538qC A01;

    public final void A00(AnonymousClass49I r17, AnonymousClass49I r18, Integer num, Long l, Object obj, String str, String str2, String str3, String str4) {
        C166557yt r4;
        C166557yt r5;
        C166557yt r6;
        C166557yt r7;
        C183538qC r0 = this.A01;
        if (r0 != null) {
            AnonymousClass2X9 r3 = (AnonymousClass2X9) r0.get();
            C166557yt r2 = null;
            Long l2 = l;
            if (l == null) {
                r4 = null;
            } else {
                r4 = new C166557yt(AnonymousClass3QD.A00(), l2, "WaLinkedFbid");
            }
            String str5 = str;
            if (str == null) {
                r5 = null;
            } else {
                r5 = new C166557yt(AnonymousClass3QD.A00(), str5, "WaLinkedNonce");
            }
            String str6 = str2;
            if (str2 == null) {
                r6 = null;
            } else {
                r6 = new C166557yt(AnonymousClass3QD.A00(), str6, "WaLinkedNativeAuthBlob");
            }
            String str7 = str3;
            if (str3 == null) {
                r7 = null;
            } else {
                r7 = new C166557yt(AnonymousClass3QD.A00(), str7, "WaLinkedWebAuthToken");
            }
            String str8 = str4;
            if (str4 != null) {
                r2 = new C166557yt(AnonymousClass3QD.A00(), str8, "WaLinkedWebAuthUri");
            }
            C86334Js r10 = new C86334Js(this, r17, r18, obj, 1);
            AnonymousClass30P A0M = C18320x8.A0M(r3.A00);
            C50912iy r32 = AnonymousClass2BX.A00;
            Object[] objArr = new Object[6];
            AnonymousClass001.A1I(r4, num, objArr);
            objArr[2] = r5;
            objArr[3] = r6;
            objArr[4] = r7;
            A0M.A05(new C85974Ii(r10, 5), r32, C54662p5.A00(), new AnonymousClass2MV(2, AnonymousClass0x9.A19(r2, objArr, 5)));
            return;
        }
        throw C18270x1.A0S("accountLinkingCustomActionsHelperLazy");
    }
}
