package X;

import android.content.UriMatcher;

/* renamed from: X.2L8  reason: invalid class name */
public class AnonymousClass2L8 {
    public final UriMatcher A00;
    public final C183538qC A01;

    public AnonymousClass2L8(C116985rC r20, C56972sr r21, C64773Ex r22, AnonymousClass5ZU r23, C56332ro r24, C56982ss r25, C56892sj r26, AnonymousClass1VX r27, AnonymousClass2OK r28, AnonymousClass2L7 r29, C45282Zk r30, C45292Zl r31, C48672fH r32, C60692yy r33, C619332v r34, C186568vZ r35) {
        C45282Zk r13 = r30;
        C64773Ex r5 = r22;
        C56972sr r4 = r21;
        C60692yy r16 = r33;
        C116985rC r3 = r20;
        AnonymousClass5ZU r6 = r23;
        C56332ro r7 = r24;
        C56982ss r8 = r25;
        C56892sj r9 = r26;
        AnonymousClass1VX r10 = r27;
        AnonymousClass2OK r11 = r28;
        AnonymousClass2L7 r12 = r29;
        this.A01 = C72333dY.A06(new C72283dT(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r31, r32, r16, r34, r35));
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.A00 = uriMatcher;
        uriMatcher.addURI("com.whatsapp.provider.instrumentation", "contacts", 1);
    }
}
