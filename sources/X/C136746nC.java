package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterDirectoryResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2PictureType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6nC  reason: invalid class name and case insensitive filesystem */
public abstract class C136746nC extends AnonymousClass47C {
    public transient C56982ss A00;
    public transient C56652sL A01;
    public transient C49552gi A02;
    public transient C162047r8 A03;
    public C184498rv callback;
    public final boolean filterOutSubscribedChannels;

    public void Bm4(Context context) {
        C162457s7.A0J(context, 0);
        C64333Db A012 = C389229y.A01(context);
        C56982ss r0 = (C56982ss) A012.A5B.get();
        C162457s7.A0J(r0, 0);
        this.A00 = r0;
        this.A02 = A012.Anh();
        C56652sL r02 = (C56652sL) A012.AOJ.get();
        C162457s7.A0J(r02, 0);
        this.A01 = r02;
        this.A03 = A012.AoV();
    }

    public void A04() {
        if (!(this instanceof C136806nI)) {
            C49552gi r0 = this.A02;
            if (r0 == null) {
                throw C18270x1.A0S("graphQlClient");
            } else if (!r0.A03.A0I()) {
                C184498rv r1 = this.callback;
                if (r1 != null) {
                    r1.BS5(new C136766nE());
                }
                this.callback = null;
            }
        }
    }

    public void A05() {
        if (!this.isCancelled) {
            this.callback = null;
        }
    }

    public boolean A06(Exception exc) {
        return false;
    }

    public final void A08(NewsletterDirectoryResponseFragmentImpl newsletterDirectoryResponseFragmentImpl) {
        ArrayList arrayList;
        AnonymousClass1RL r0;
        C156127g4 r7;
        C153197aq r13;
        AnonymousClass31A r72;
        long j;
        String str;
        long j2;
        long A0H;
        C372821q r10;
        C371621e r27;
        boolean z;
        GraphQLXWA2NewsletterVerifyState graphQLXWA2NewsletterVerifyState;
        String A04;
        String A042;
        C153197aq A002;
        if (!this.isCancelled) {
            NewsletterDirectoryResponseFragmentImpl newsletterDirectoryResponseFragmentImpl2 = newsletterDirectoryResponseFragmentImpl;
            C129586aY A022 = newsletterDirectoryResponseFragmentImpl2.A02(NewsletterDirectoryResponseFragmentImpl.Result.class, "result");
            String str2 = null;
            if (A022 != null) {
                arrayList = AnonymousClass001.A0s();
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    C153197aq r6 = (C153197aq) it.next();
                    C162047r8 r1 = this.A03;
                    if (r1 != null) {
                        String str3 = null;
                        if (r6 != null) {
                            C95804uY A003 = C106415Yx.A00(r6.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                            C56982ss r02 = r1.A05;
                            C56982ss r54 = r02;
                            AnonymousClass31A A06 = r1.A06(r02.A0A(A003, false));
                            if (A06 instanceof AnonymousClass1RL) {
                                r0 = (AnonymousClass1RL) A06;
                            } else {
                                r0 = null;
                            }
                            long j3 = -1;
                            if (r0 == null || r0.A00 == -1) {
                                r0 = null;
                            }
                            Class<NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata> cls = NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.class;
                            C153197aq A004 = r6.A00(cls, "thread_metadata");
                            if (A004 == null || (A002 = A004.A00(NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Picture.class, "picture")) == null) {
                                r7 = null;
                            } else {
                                String A043 = A002.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                A002.A03(GraphQLXWA2PictureType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                A002.A04("url");
                                r7 = new C156127g4(A043, A002.A04("direct_path"));
                            }
                            String str4 = null;
                            C152357Yo A023 = C162047r8.A02((AnonymousClass1RL) null, r7, true);
                            r1.A0B.A05(r0, (AnonymousClass1RL) null, A003, A023, A023);
                            C153197aq A005 = r6.A00(cls, "thread_metadata");
                            if (A005 != null) {
                                r13 = A005.A00(NewsletterDirectoryResponseFragmentImpl.Result.ThreadMetadata.Name.class, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            } else {
                                r13 = null;
                            }
                            if (r0 != null) {
                                r72 = r0.A0P;
                                j = r0.A00;
                            } else {
                                if (r13 != null) {
                                    str4 = r13.A04("text");
                                }
                                r72 = new AnonymousClass31A((C95814uZ) A003);
                                r72.A0W = -1;
                                r72.A0h = str4;
                                r72.A02 = 4;
                                j = -1;
                            }
                            if (r13 != null) {
                                str = r13.A04("text");
                                String optString = r13.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                if (optString != null) {
                                    j2 = Long.parseLong(optString);
                                }
                                j2 = -1;
                            } else {
                                str = null;
                                j2 = -1;
                            }
                            String str5 = A023.A02;
                            long j4 = A023.A01;
                            C153197aq A006 = r6.A00(cls, "thread_metadata");
                            if (A006 == null || (A042 = A006.A04("creation_time")) == null) {
                                A0H = r1.A03.A0H();
                            } else {
                                A0H = Long.parseLong(A042) * 1000;
                            }
                            C153197aq A007 = r6.A00(cls, "thread_metadata");
                            if (A007 != null) {
                                str3 = A007.A04("invite");
                            }
                            C153197aq A008 = r6.A00(cls, "thread_metadata");
                            if (!(A008 == null || (A04 = A008.A04("subscribers_count")) == null)) {
                                j3 = Long.parseLong(A04);
                            }
                            if (r0 != null) {
                                r10 = r0.A07;
                            } else {
                                r10 = C372821q.GUEST;
                            }
                            C371421c r25 = C371421c.PUBLIC;
                            C153197aq A009 = r6.A00(cls, "thread_metadata");
                            if (A009 == null || (graphQLXWA2NewsletterVerifyState = (GraphQLXWA2NewsletterVerifyState) A009.A03(GraphQLXWA2NewsletterVerifyState.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "verification")) == null || graphQLXWA2NewsletterVerifyState.ordinal() != 1) {
                                r27 = C371621e.NOT_VERIFIED;
                            } else {
                                r27 = C371621e.VERIFIED;
                            }
                            C372321l r26 = C372321l.NOT_ENFORCED;
                            if (r0 != null) {
                                z = r0.A0L;
                            } else {
                                z = true;
                            }
                            C372821q r22 = r10;
                            AnonymousClass31A r21 = r72;
                            AnonymousClass1RL r19 = new AnonymousClass1RL((C129586aY) null, r21, r22, AnonymousClass599.DEFAULT, C372921r.DEFAULT, r25, r26, r27, (Long) null, str, (String) null, (String) null, str5, (String) null, str3, AnonymousClass001.A0s(), j, j2, 0, 0, j4, A0H, j3, z, false, false, false);
                            r19.A0J(r0);
                            r54.A0H(r19, A003);
                            if (r0 != null) {
                                r1.A06.A0A(C18290x4.A12(r19));
                            }
                            arrayList.add(r19);
                        }
                    } else {
                        throw C18270x1.A0S("newsletterGraphqlUtil");
                    }
                }
            } else {
                arrayList = null;
            }
            if (this.filterOutSubscribedChannels) {
                if (arrayList != null) {
                    ArrayList A0s = AnonymousClass001.A0s();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (AnonymousClass000.A1Y(((AnonymousClass1RL) next).A07, C372821q.GUEST)) {
                            A0s.add(next);
                        }
                    }
                    arrayList = A0s;
                } else {
                    return;
                }
            } else if (arrayList == null) {
                return;
            }
            C184498rv r3 = this.callback;
            if (r3 != null) {
                C153197aq A0010 = newsletterDirectoryResponseFragmentImpl2.A00(NewsletterDirectoryResponseFragmentImpl.PageInfo.class, "page_info");
                if (A0010 != null) {
                    str2 = A0010.A04("endCursor");
                }
                r3.BiS(str2, arrayList);
            }
        }
    }

    public C136746nC(C184498rv r1, String str, boolean z) {
        super(str);
        this.callback = r1;
        this.filterOutSubscribedChannels = z;
    }

    public void cancel() {
        super.cancel();
        this.callback = null;
    }
}
