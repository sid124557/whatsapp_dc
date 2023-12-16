package X;

import android.net.Uri;
import com.whatsapp.group.GroupPermissionsActivity;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.stickers.WebpUtils;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4J4  reason: invalid class name */
public class AnonymousClass4J4 implements C17190ui {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4J4(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* synthetic */ C05550Ty Azr(Class cls) {
        switch (this.A02) {
            case 0:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 1:
                C64333Db r3 = ((C39532Ci) this.A00).A00.A03;
                C55682qk A012 = C64333Db.A01(r3);
                AnonymousClass4FS A8y = C64333Db.A8y(r3);
                C66493Lq A5A = C64333Db.A5A(r3);
                C66473Lo r8 = (C66473Lo) r3.A6p.get();
                AnonymousClass10d r5 = new AnonymousClass10d(A012, (C55052pi) r3.A6R.get(), r8, A5A, (C30191m3) r3.ARj.get(), A8y, (Collection) this.A01);
                Iterator it = r5.A0B.iterator();
                while (it.hasNext()) {
                    r5.A01.add(r5.A04.A01(C18300x5.A0P(it)));
                }
                r5.A08.A0H(r5.A01);
                r5.A0D();
                return r5;
            case 2:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 3:
                throw AnonymousClass002.A0G("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            default:
                Class cls2 = cls;
                C162457s7.A0J(cls2, 0);
                if (cls2.isAssignableFrom(AnonymousClass11N.class)) {
                    C27991fJ r9 = (C27991fJ) this.A00;
                    GroupPermissionsActivity groupPermissionsActivity = (GroupPermissionsActivity) this.A01;
                    C56612sH r20 = groupPermissionsActivity.A06;
                    AnonymousClass1VX r19 = groupPermissionsActivity.A0D;
                    C69263Wi r37 = groupPermissionsActivity.A05;
                    C56972sr r36 = groupPermissionsActivity.A01;
                    AnonymousClass4FS r18 = groupPermissionsActivity.A04;
                    C56982ss r0 = groupPermissionsActivity.A03;
                    C56982ss r16 = r0;
                    if (r0 != null) {
                        AnonymousClass4FV r14 = groupPermissionsActivity.A07;
                        if (r14 != null) {
                            AnonymousClass31C r13 = groupPermissionsActivity.A0F;
                            if (r13 != null) {
                                RtaXmppClient rtaXmppClient = groupPermissionsActivity.A0H;
                                if (rtaXmppClient != null) {
                                    C64773Ex r11 = groupPermissionsActivity.A01;
                                    if (r11 != null) {
                                        AnonymousClass5ZU r10 = groupPermissionsActivity.A02;
                                        if (r10 != null) {
                                            C56072rN r82 = groupPermissionsActivity.A0I;
                                            if (r82 != null) {
                                                C66493Lq r7 = groupPermissionsActivity.A08;
                                                if (r7 != null) {
                                                    C66503Lr r6 = groupPermissionsActivity.A0C;
                                                    if (r6 != null) {
                                                        C48252eb r52 = groupPermissionsActivity.A0G;
                                                        if (r52 != null) {
                                                            C28891hw r32 = groupPermissionsActivity.A04;
                                                            if (r32 != null) {
                                                                C50932j0 r2 = groupPermissionsActivity.A09;
                                                                if (r2 != null) {
                                                                    C56892sj r1 = groupPermissionsActivity.A06;
                                                                    if (r1 != null) {
                                                                        C29441ip r17 = groupPermissionsActivity.A07;
                                                                        C54442oj r02 = groupPermissionsActivity.A05;
                                                                        if (r02 != null) {
                                                                            AnonymousClass2CL r15 = groupPermissionsActivity.A00;
                                                                            if (r15 != null) {
                                                                                AnonymousClass4FS r35 = r18;
                                                                                C56982ss r21 = r16;
                                                                                return new AnonymousClass11N(r15, r37, r36, r17, r11, r10, r20, r21, r32, r02, r1, r19, r14, r7, r2, r6, r9, r13, r52, rtaXmppClient, r82, r35);
                                                                            }
                                                                            throw C18270x1.A0S("groupMembershipApprovalModeApiHandlerFactory");
                                                                        }
                                                                        throw C18270x1.A0S("groupMembershipApprovalRequestStore");
                                                                    }
                                                                    throw C18270x1.A0S("groupParticipantsManager");
                                                                }
                                                                throw C18270x1.A0S("groupDataChangeListeners");
                                                            }
                                                            throw C18270x1.A0S("conversationObservers");
                                                        }
                                                        throw C18270x1.A0S("rtaExperimentUtils");
                                                    }
                                                    throw C18270x1.A0S("groupXmppMethods");
                                                }
                                                throw C18270x1.A0S("groupChatManager");
                                            }
                                            throw C18270x1.A0S("groupChatUtils");
                                        }
                                        throw C18270x1.A0S("wAContactNames");
                                    }
                                    throw C18270x1.A0S("contactManager");
                                }
                                throw C18270x1.A0S("rtaXmppClient");
                            }
                            throw C18270x1.A0S("messageClient");
                        }
                        throw C18270x1.A0S("wamRuntime");
                    }
                    throw C18270x1.A0S("chatsCache");
                }
                throw AnonymousClass001.A0c("Invalid viewModel");
        }
    }

    public C05550Ty B09(AnonymousClass0N3 r15, Class cls) {
        switch (this.A02) {
            case 0:
                C64333Db r1 = ((C39522Ch) this.A00).A00.A03;
                C54292oU A2q = C64333Db.A2q(r1);
                C56982ss A39 = C64333Db.A39(r1);
                C29431io A3K = C64333Db.A3K(r1);
                C54922pV r7 = (C54922pV) r1.A9G.get();
                C56942so A1k = C64333Db.A1k(r1);
                AnonymousClass46Q r9 = AnonymousClass2C4.A01;
                C615931l.A00(r9);
                return new AnonymousClass10c(A1k, A2q, A39, A3K, r7, (C95814uZ) this.A01, r9);
            case 2:
                C118055sv r12 = ((C39642Ct) this.A00).A00;
                C64333Db r5 = r12.A04;
                C64333Db r13 = r12.A03.A1B;
                C59452ww r14 = new C59452ww((C56352rq) r13.ATd.get(), (C56492s4) r13.AWW.get(), (C48092eK) r13.AYV.get());
                C621033m A08 = C64333Db.A08(r5);
                C56352rq r72 = (C56352rq) r5.ATd.get();
                C54292oU A2q2 = C64333Db.A2q(r5);
                AnonymousClass46Q r132 = AnonymousClass2C4.A01;
                C615931l.A00(r132);
                return new C194410o((Uri) this.A01, r72, A08, A2q2, (C106695a0) r5.AKA.get(), (WebpUtils) r5.AbM.get(), r14, r132);
            case 3:
                C64333Db r16 = ((C39662Cv) this.A00).A00.A04;
                C56972sr A06 = C64333Db.A06(r16);
                C54292oU A2q3 = C64333Db.A2q(r16);
                C45942ap r73 = (C45942ap) r16.A00.A44.get();
                C54012o2 r6 = (C54012o2) r16.ATM.get();
                C55832qz A8F = C64333Db.A8F(r16);
                C29431io A3K2 = C64333Db.A3K(r16);
                AnonymousClass46Q r10 = AnonymousClass2C4.A01;
                C615931l.A00(r10);
                return new AnonymousClass11L(A06, A2q3, A3K2, r6, r73, (AnonymousClass2z0) this.A01, A8F, r10);
            default:
                return AnonymousClass0IW.A00(this, cls);
        }
    }
}
