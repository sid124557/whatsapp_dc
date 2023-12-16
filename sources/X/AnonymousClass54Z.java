package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.54Z  reason: invalid class name */
public final class AnonymousClass54Z extends AnonymousClass5ZM {
    public final WeakReference A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass54Z(C89634eX r2, List list) {
        super(r2, true);
        C162457s7.A0J(list, 2);
        this.A01 = list;
        this.A00 = AnonymousClass0x9.A14(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0232, code lost:
        if (r2.A0D.A0N(6742) == 1) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        if (r7 == null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01de, code lost:
        if (r2.A0D.A0N(6742) != 1) goto L_0x0211;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r15) {
        /*
            r14 = this;
            java.lang.ref.WeakReference r0 = r14.A00
            java.lang.Object r6 = r0.get()
            X.4eX r6 = (X.C89634eX) r6
            if (r6 == 0) goto L_0x0509
            boolean r0 = r6 instanceof com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector
            if (r0 == 0) goto L_0x0053
            r3 = r6
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector r3 = (com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector) r3
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.List r0 = r3.A06
            if (r0 == 0) goto L_0x003b
            java.util.ArrayList r2 = X.C73783g4.A0c(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r1.next()
            X.5Ih r0 = (X.C102295Ih) r0
            X.3ZH r0 = r0.A00
            r2.add(r0)
            goto L_0x0021
        L_0x0033:
            X.4lx r0 = new X.4lx
            r0.<init>(r2)
            r5.add(r0)
        L_0x003b:
            X.66R r0 = r3.A09
            boolean r0 = X.C18270x1.A1V(r0)
            if (r0 == 0) goto L_0x02ec
            java.util.List r2 = r3.A0U
            X.C162457s7.A0C(r2)
            r1 = 2131888165(0x7f120825, float:1.9410958E38)
            r0 = 1
            X.5SS r3 = new X.5SS
            r3.<init>(r2, r1, r0)
            goto L_0x02e9
        L_0x0053:
            boolean r0 = r6 instanceof com.whatsapp.group.GroupMembersSelector
            if (r0 == 0) goto L_0x0096
            r7 = r6
            com.whatsapp.group.GroupMembersSelector r7 = (com.whatsapp.group.GroupMembersSelector) r7
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.1VX r1 = r7.A0D
            r0 = 3689(0xe69, float:5.17E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x026e
            java.util.List r0 = r7.A0B
            if (r0 != 0) goto L_0x0264
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r7.A0B = r0
            X.2xn r0 = r7.A06
            java.util.ArrayList r0 = r0.A00()
            java.util.Iterator r2 = r0.iterator()
        L_0x007c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0264
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Ex r0 = r7.A0B
            X.3ZH r1 = r0.A07(r1)
            boolean r0 = r1.A10
            if (r0 == 0) goto L_0x007c
            java.util.List r0 = r7.A0B
            r0.add(r1)
            goto L_0x007c
        L_0x0096:
            boolean r0 = r6 instanceof com.whatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x016b
            r2 = r6
            com.whatsapp.contact.picker.AddGroupParticipantsSelector r2 = (com.whatsapp.contact.picker.AddGroupParticipantsSelector) r2
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            X.2js r3 = r2.A03
            if (r3 == 0) goto L_0x00fd
            X.1VX r1 = r2.A0D
            r0 = 3795(0xed3, float:5.318E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00d9
            X.2ss r1 = r2.A05
            if (r1 == 0) goto L_0x0164
            X.66R r0 = r2.A0R
            java.lang.Object r0 = r0.getValue()
            X.4uZ r0 = (X.C95814uZ) r0
            java.lang.String r4 = r1.A0D(r0)
            java.lang.String r1 = "com.whatsapp.community.DirectoryContactsLoader"
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00cd
            X.3d7 r0 = X.C72063d7.A00
        L_0x00cd:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            X.4lz r0 = new X.4lz
            r0.<init>(r4, r1)
            r5.add(r0)
        L_0x00d9:
            X.1VX r1 = r2.A0D
            r0 = 3689(0xe69, float:5.17E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r1 = "com.whatsapp.contact.picker.RecentlyAcceptedInviteContactsLoader"
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x00f1
            X.3d7 r0 = X.C72063d7.A00
        L_0x00f1:
            java.util.ArrayList r1 = X.AnonymousClass002.A0J(r0)
            X.4lv r0 = new X.4lv
            r0.<init>(r1)
            r5.add(r0)
        L_0x00fd:
            java.util.List r1 = r2.A0U
            X.C162457s7.A0C(r1)
            X.4lw r0 = new X.4lw
            r0.<init>(r1)
            r5.add(r0)
            boolean r0 = X.AnonymousClass4SG.A42(r2)
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r2.A0S
            if (r0 == 0) goto L_0x0161
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0161
            java.util.List r1 = r2.A0V
        L_0x011c:
            X.C162457s7.A0H(r1)
            X.4ly r0 = new X.4ly
            r0.<init>(r1)
            r5.add(r0)
        L_0x0127:
            if (r3 == 0) goto L_0x02ec
            boolean r0 = r2.A7e()
            if (r0 != 0) goto L_0x0139
            X.1VX r1 = r2.A0D
            r0 = 4575(0x11df, float:6.411E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02ec
        L_0x0139:
            X.1VX r1 = r2.A0D
            r0 = 4136(0x1028, float:5.796E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02ec
            X.5ZU r2 = r2.A0D
            X.C162457s7.A0C(r2)
            java.lang.String r1 = "com.whatsapp.contact.picker.NonWaContactsLoader"
            java.util.Map r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 != 0) goto L_0x0156
            X.3d7 r0 = X.C72063d7.A00
        L_0x0156:
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            X.4m1 r3 = new X.4m1
            r3.<init>(r2, r0)
            goto L_0x02e9
        L_0x0161:
            java.util.List r1 = r2.A0W
            goto L_0x011c
        L_0x0164:
            java.lang.String r0 = "chatsCache"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x016b:
            boolean r0 = r6 instanceof com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x025d
            r2 = r6
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker) r2
            r3 = 1
            r2.A09 = r3
            java.lang.String r0 = r2.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r0 == 0) goto L_0x021f
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r5 = r2.A00
            if (r5 == 0) goto L_0x0196
            java.util.List r0 = r5.A02
            if (r0 != 0) goto L_0x0191
            r0 = 0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1 r1 = new com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel$getContacts$1     // Catch:{ Exception -> 0x0198 }
            r1.<init>(r5, r0)     // Catch:{ Exception -> 0x0198 }
            X.3du r0 = X.C72553du.A00     // Catch:{ Exception -> 0x0198 }
            X.C380725l.A00(r0, r1)     // Catch:{ Exception -> 0x0198 }
        L_0x0191:
            java.util.List r7 = r5.A02
            if (r7 != 0) goto L_0x01a8
            goto L_0x01a6
        L_0x0196:
            r7 = 0
            goto L_0x01a8
        L_0x0198:
            r5 = move-exception
            boolean r0 = r5 instanceof java.lang.InterruptedException
            if (r0 == 0) goto L_0x0213
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel/getContacts/was interrupted: "
        L_0x01a3:
            X.C18260x0.A1Q(r1, r0, r5)
        L_0x01a6:
            X.3d3 r7 = X.C72023d3.A00
        L_0x01a8:
            if (r7 == 0) goto L_0x021f
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x021f
            r2.A09 = r4
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            r1 = 2131888167(0x7f120827, float:1.9410962E38)
            X.5SS r0 = new X.5SS
            r0.<init>(r7, r1, r3)
            r5.add(r0)
            java.util.List r1 = r2.A0U
            X.4lw r0 = new X.4lw
            r0.<init>(r1)
            r5.add(r0)
            java.util.ArrayList r0 = r2.A08
            if (r0 == 0) goto L_0x0211
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0211
            X.1VX r1 = r2.A0D
            r0 = 6742(0x1a56, float:9.448E-42)
            int r1 = r1.A0N(r0)
            r0 = 1
            if (r1 != r3) goto L_0x0211
        L_0x01e0:
            if (r0 == 0) goto L_0x01f1
            X.5ZU r3 = r2.A0D
            java.util.ArrayList r1 = r2.A08
            X.C626936e.A06(r1)
            X.4m0 r0 = new X.4m0
            r0.<init>(r3, r1)
            r5.add(r0)
        L_0x01f1:
            X.32x r4 = X.AnonymousClass4SG.A2i(r2)
            int r0 = r7.size()
            java.lang.Long r3 = X.AnonymousClass0x9.A0m(r0)
            com.whatsapp.calling.callhistory.group.GroupCallParticipantSuggestionsViewModel r0 = r2.A00
            X.C626936e.A06(r0)
            long r0 = r0.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            X.3dI r1 = r4.A02
            r0 = 43
            X.C86654Ky.A1O(r1, r4, r3, r2, r0)
            goto L_0x02ec
        L_0x0211:
            r0 = 0
            goto L_0x01e0
        L_0x0213:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x021e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "GroupCallParticipantSuggestionsViewModel/getContacts/was cancelled: "
            goto L_0x01a3
        L_0x021e:
            throw r5
        L_0x021f:
            java.util.ArrayList r0 = r2.A08
            if (r0 == 0) goto L_0x0254
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0254
            X.1VX r1 = r2.A0D
            r0 = 6742(0x1a56, float:9.448E-42)
            int r1 = r1.A0N(r0)
            r0 = 1
            if (r1 != r3) goto L_0x0254
        L_0x0234:
            if (r0 == 0) goto L_0x0256
            r2.A09 = r4
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.List r1 = r2.A0U
            X.4lw r0 = new X.4lw
            r0.<init>(r1)
            r5.add(r0)
            X.5ZU r1 = r2.A0D
            java.util.ArrayList r0 = r2.A08
            X.C626936e.A06(r0)
            X.4m0 r3 = new X.4m0
            r3.<init>(r1, r0)
            goto L_0x02e9
        L_0x0254:
            r0 = 0
            goto L_0x0234
        L_0x0256:
            X.5tH r5 = new X.5tH
            r5.<init>(r2)
            goto L_0x02ec
        L_0x025d:
            X.5tH r5 = new X.5tH
            r5.<init>(r6)
            goto L_0x02ec
        L_0x0264:
            java.util.List r1 = r7.A0B
            X.4lv r0 = new X.4lv
            r0.<init>(r1)
            r5.add(r0)
        L_0x026e:
            X.2ss r1 = r7.A03
            X.1fJ r0 = r7.A08
            int r1 = r1.A06(r0)
            r0 = 1
            if (r1 != r0) goto L_0x0297
            X.1VX r1 = r7.A0D
            r0 = 3795(0xed3, float:5.318E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x0297
            X.2ss r1 = r7.A03
            X.1fJ r0 = r7.A08
            java.lang.String r2 = r1.A0D(r0)
            java.util.List r1 = r7.A7c()
            X.4lz r0 = new X.4lz
            r0.<init>(r2, r1)
            r5.add(r0)
        L_0x0297:
            java.util.List r1 = r7.A0U
            X.4lw r0 = new X.4lw
            r0.<init>(r1)
            r5.add(r0)
            boolean r0 = X.AnonymousClass4SG.A42(r7)
            if (r0 == 0) goto L_0x02b9
            java.lang.String r0 = r7.A0S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0505
            java.util.List r1 = r7.A0W
        L_0x02b1:
            X.4ly r0 = new X.4ly
            r0.<init>(r1)
            r5.add(r0)
        L_0x02b9:
            X.1VX r1 = r7.A0D
            r0 = 4136(0x1028, float:5.796E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x02ec
            X.5ZU r4 = r7.A0D
            java.util.List r0 = r7.A0A
            if (r0 != 0) goto L_0x02e2
            java.util.ArrayList r1 = X.AnonymousClass001.A0s()
            r7.A0A = r1
            X.3Ex r0 = r7.A0B
            r0.A0i(r1)
            java.util.List r3 = r7.A0A
            X.5ZU r2 = r7.A0D
            X.33j r1 = r7.A0N
            X.5sc r0 = new X.5sc
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
        L_0x02e2:
            java.util.List r0 = r7.A0A
            X.4m1 r3 = new X.4m1
            r3.<init>(r4, r0)
        L_0x02e9:
            r5.add(r3)
        L_0x02ec:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0509
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            java.util.Iterator r13 = r5.iterator()
        L_0x02fe:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x052a
            java.lang.Object r8 = r13.next()
            X.5SS r8 = (X.AnonymousClass5SS) r8
            java.util.List r7 = r14.A01
            boolean r0 = r8 instanceof X.C92024ly
            if (r0 == 0) goto L_0x032d
            java.util.List r0 = r8.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x0316:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037f
            X.3ZH r1 = X.C18310x6.A0R(r2)
            java.util.ArrayList r0 = r8.A01
            r0.add(r1)
            X.4uZ r0 = r1.A0H
            if (r0 == 0) goto L_0x0316
            r3.add(r0)
            goto L_0x0316
        L_0x032d:
            boolean r0 = r8 instanceof X.C92054m1
            if (r0 == 0) goto L_0x034d
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.util.List r0 = r8.A02
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x033f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037f
            X.3ZH r0 = X.C18310x6.A0R(r1)
            X.AnonymousClass5SS.A00(r8, r0, r7, r3)
            goto L_0x033f
        L_0x034d:
            boolean r1 = r8 instanceof X.C92014lx
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            java.util.List r0 = r8.A02
            if (r1 == 0) goto L_0x0369
            java.util.Iterator r1 = r0.iterator()
        L_0x035b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x037f
            X.3ZH r0 = X.C18310x6.A0R(r1)
            X.AnonymousClass5SS.A00(r8, r0, r7, r3)
            goto L_0x035b
        L_0x0369:
            java.util.Iterator r2 = r0.iterator()
        L_0x036d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037f
            X.3ZH r1 = X.C18310x6.A0R(r2)
            boolean r0 = r1.A10
            if (r0 == 0) goto L_0x036d
            X.AnonymousClass5SS.A00(r8, r1, r7, r3)
            goto L_0x036d
        L_0x037f:
            boolean r0 = r8.A03
            r9 = 1
            if (r0 != 0) goto L_0x03a1
            java.util.Iterator r2 = r5.iterator()
            r1 = 0
        L_0x0389:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03fe
            java.lang.Object r0 = r2.next()
            X.5SS r0 = (X.AnonymousClass5SS) r0
            java.util.ArrayList r0 = r0.A01
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x0389
            int r1 = r1 + 1
            if (r1 <= r9) goto L_0x0389
        L_0x03a1:
            r1 = 1
        L_0x03a2:
            boolean r0 = r8 instanceof X.C92054m1
            if (r0 == 0) goto L_0x04cc
            X.4m1 r8 = (X.C92054m1) r8
            boolean r0 = r8 instanceof X.C92044m0
            if (r0 == 0) goto L_0x0436
            java.util.LinkedHashMap r9 = X.C18320x8.A0r()
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r10 = r8.A01
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0500
            if (r1 == 0) goto L_0x03ca
            java.lang.String r1 = r8.A01(r6)
            X.4lt r0 = new X.4lt
            r0.<init>(r1)
            r7.add(r0)
        L_0x03ca:
            java.util.Iterator r11 = r10.iterator()
        L_0x03ce:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0400
            X.3ZH r2 = X.C18310x6.A0R(r11)
            X.5ZU r0 = r8.A00
            java.lang.String r1 = r0.A0H(r2)
            if (r1 == 0) goto L_0x03ce
            int r0 = r1.length()
            if (r0 == 0) goto L_0x03ce
            boolean r0 = r9.containsKey(r1)
            if (r0 != 0) goto L_0x03ef
            X.C86624Kv.A1R(r1, r9)
        L_0x03ef:
            java.lang.Object r0 = r9.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x03ce
            X.C162457s7.A0H(r2)
            r0.add(r2)
            goto L_0x03ce
        L_0x03fe:
            r1 = 0
            goto L_0x03a2
        L_0x0400:
            java.util.Iterator r10 = r10.iterator()
        L_0x0404:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0500
            X.3ZH r1 = X.C18310x6.A0R(r10)
            X.5ZU r0 = r8.A00
            java.lang.String r2 = r0.A0H(r1)
            if (r2 == 0) goto L_0x0404
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0404
            java.lang.Object r1 = r9.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0404
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0404
            X.4ls r0 = new X.4ls
            r0.<init>(r1)
            r7.add(r0)
            r9.remove(r2)
            goto L_0x0404
        L_0x0436:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = r8.A01
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0500
            if (r1 == 0) goto L_0x0450
            java.lang.String r1 = r8.A01(r6)
            X.4lt r0 = new X.4lt
            r0.<init>(r1)
            r7.add(r0)
        L_0x0450:
            java.util.HashMap r11 = X.AnonymousClass001.A0t()
            java.util.Iterator r12 = r2.iterator()
        L_0x0458:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0493
            X.3ZH r10 = X.C18310x6.A0R(r12)
            X.5ZU r1 = r8.A00
            r0 = -1
            X.7HU r0 = r1.A0B(r10, r0)
            java.lang.String r1 = r0.A01
            r10 = 0
            if (r1 == 0) goto L_0x0458
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0458
            boolean r0 = r11.containsKey(r1)
            if (r0 == 0) goto L_0x048e
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r1, r11)
            if (r0 == 0) goto L_0x0484
            int r10 = r0.intValue()
        L_0x0484:
            int r0 = r10 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x048a:
            r11.put(r1, r0)
            goto L_0x0458
        L_0x048e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            goto L_0x048a
        L_0x0493:
            java.util.Iterator r12 = r2.iterator()
        L_0x0497:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0500
            X.3ZH r10 = X.C18310x6.A0R(r12)
            X.C162457s7.A0H(r10)
            X.5ZU r1 = r8.A00
            r0 = -1
            X.7HU r0 = r1.A0B(r10, r0)
            java.lang.String r2 = r0.A01
            r1 = 0
            if (r2 == 0) goto L_0x04c2
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x04c2
            java.lang.Number r0 = X.AnonymousClass0x9.A0p(r2, r11)
            if (r0 == 0) goto L_0x04c2
            int r0 = r0.intValue()
            if (r0 == r9) goto L_0x04c3
        L_0x04c2:
            r1 = 1
        L_0x04c3:
            X.4lr r0 = new X.4lr
            r0.<init>(r10, r1)
            r7.add(r0)
            goto L_0x0497
        L_0x04cc:
            java.util.ArrayList r7 = X.AnonymousClass001.A0s()
            java.util.ArrayList r2 = r8.A01
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0500
            if (r1 == 0) goto L_0x04e6
            java.lang.String r1 = r8.A01(r6)
            X.4lt r0 = new X.4lt
            r0.<init>(r1)
            r7.add(r0)
        L_0x04e6:
            java.util.Iterator r2 = r2.iterator()
        L_0x04ea:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0500
            X.3ZH r1 = X.C18310x6.A0R(r2)
            X.C162457s7.A0H(r1)
            X.4lq r0 = new X.4lq
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x04ea
        L_0x0500:
            r4.addAll(r7)
            goto L_0x02fe
        L_0x0505:
            java.util.List r1 = r7.A0V
            goto L_0x02b1
        L_0x0509:
            java.util.List r0 = r14.A01
            java.util.ArrayList r3 = X.C73783g4.A0c(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0513:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0526
            X.3ZH r1 = X.C18310x6.A0R(r2)
            X.4lq r0 = new X.4lq
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0513
        L_0x0526:
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r3)
        L_0x052a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54Z.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        C89634eX r0 = (C89634eX) this.A00.get();
        if (r0 != null) {
            r0.A7Z(list);
        }
    }
}
