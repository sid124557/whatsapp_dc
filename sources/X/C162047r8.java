package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder;
import com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl;
import com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7r8  reason: invalid class name and case insensitive filesystem */
public final class C162047r8 {
    public final C55682qk A00;
    public final C69263Wi A01;
    public final C29421in A02;
    public final C56612sH A03;
    public final C28871hu A04;
    public final C56982ss A05;
    public final C56652sL A06;
    public final C56662sM A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass5UP A09;
    public final C53942nv A0A;
    public final C161747qM A0B;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C152357Yo A02(X.AnonymousClass1RL r10, X.C156127g4 r11, boolean r12) {
        /*
            r4 = 0
            if (r12 == 0) goto L_0x005e
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A03
        L_0x0007:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x000b:
            r2 = -1
            if (r0 == 0) goto L_0x005b
            long r8 = r0.longValue()
        L_0x0013:
            if (r12 == 0) goto L_0x0054
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0J
        L_0x0019:
            if (r11 != 0) goto L_0x0022
            r5 = r8
        L_0x001c:
            X.7Yo r4 = new X.7Yo
            r4.<init>(r5, r7, r8)
            return r4
        L_0x0022:
            java.lang.String r1 = r11.A00
            if (r1 != 0) goto L_0x002e
            java.lang.String r0 = r11.A01
            if (r0 != 0) goto L_0x002e
            r5 = r8
        L_0x002b:
            r7 = r4
            r8 = r2
            goto L_0x001c
        L_0x002e:
            java.lang.String r0 = r11.A01
            if (r0 == 0) goto L_0x004e
            java.lang.Long r0 = X.C829745q.A07(r0)
            if (r0 == 0) goto L_0x004e
            long r5 = r0.longValue()
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            r1 = r7
        L_0x003f:
            r4 = r1
            if (r1 == 0) goto L_0x002b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002b
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0051
            r2 = r8
            goto L_0x002b
        L_0x004e:
            r5 = -1
            goto L_0x003c
        L_0x0051:
            r2 = 0
            goto L_0x002b
        L_0x0054:
            if (r10 == 0) goto L_0x0059
            java.lang.String r7 = r10.A0I
            goto L_0x0019
        L_0x0059:
            r7 = r4
            goto L_0x0019
        L_0x005b:
            r8 = -1
            goto L_0x0013
        L_0x005e:
            if (r10 == 0) goto L_0x0063
            long r0 = r10.A04
            goto L_0x0007
        L_0x0063:
            r0 = r4
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162047r8.A02(X.1RL, X.7g4, boolean):X.7Yo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01aa, code lost:
        if (r12 == null) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b0, code lost:
        if (r12 != null) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RL A08(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r55) {
        /*
            r54 = this;
            r5 = 0
            r1 = r55
            X.7aq r1 = (X.C153197aq) r1
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A04(r0)
            X.4uY r10 = X.C106415Yx.A00(r0)
            r4 = r54
            X.2ss r11 = r4.A05
            X.31A r0 = r11.A0A(r10, r5)
            X.31A r2 = r4.A06(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1RL
            if (r0 == 0) goto L_0x01e3
            X.1RL r2 = (X.AnonymousClass1RL) r2
        L_0x0021:
            r7 = -1
            r34 = 0
            if (r2 == 0) goto L_0x01df
            long r0 = r2.A00
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01df
        L_0x002d:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x01db
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BBK()
        L_0x0037:
            r14 = 0
            r9 = 1
            X.7g4 r0 = A03(r0, r5)
            X.7Yo r1 = A02(r2, r0, r9)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x01d7
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r0 = r0.BBd()
        L_0x004b:
            X.7g4 r0 = A04(r0, r5)
            X.7Yo r6 = A02(r2, r0, r5)
            X.7qM r0 = r4.A0B
            r29 = r34
            r15 = r0
            r16 = r2
            r17 = r34
            r18 = r10
            r19 = r1
            r20 = r6
            r15.A05(r16, r17, r18, r19, r20)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x01d3
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r15 = r0.B9u()
        L_0x006f:
            if (r2 == 0) goto L_0x01bc
            X.31A r3 = r2.A0P
        L_0x0073:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x01a6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r12 = r0.BCu()
            if (r12 == 0) goto L_0x01a8
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r12.BBs()
            if (r0 == 0) goto L_0x01a8
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r19 = r0.BE9()
        L_0x0089:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r12.BBs()
            if (r0 == 0) goto L_0x01ae
            X.6aY r20 = r0.B4i()
        L_0x0093:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r12.BBs()
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = r0.B7J()
            if (r0 == 0) goto L_0x01b4
            long r17 = java.lang.Long.parseLong(r0)
        L_0x00a3:
            if (r2 == 0) goto L_0x01a2
            long r12 = r2.A00
        L_0x00a7:
            if (r15 == 0) goto L_0x019e
            java.lang.String r29 = r15.BDZ()
            java.lang.String r0 = r15.getId()
            if (r0 == 0) goto L_0x019e
            long r38 = java.lang.Long.parseLong(r0)
        L_0x00b7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x019a
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.B6w()
            if (r0 == 0) goto L_0x019a
            java.lang.String r30 = r0.BDZ()
        L_0x00c7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x0196
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r0 = r0.B6w()
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0196
            long r40 = java.lang.Long.parseLong(r0)
        L_0x00dd:
            java.lang.String r0 = r1.A02
            r22 = r0
            long r0 = r1.A01
            r44 = r0
            java.lang.String r0 = r6.A02
            r21 = r0
            long r15 = r6.A01
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = r0.B6D()
            if (r0 == 0) goto L_0x018e
            long r46 = java.lang.Long.parseLong(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r46 = r46 * r0
        L_0x00ff:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x018a
            java.lang.String r33 = r0.B7z()
        L_0x0109:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x0113
            java.lang.String r34 = r0.B8T()
        L_0x0113:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = r0.BDN()
            if (r0 == 0) goto L_0x0123
            long r7 = java.lang.Long.parseLong(r0)
        L_0x0123:
            if (r2 == 0) goto L_0x0187
            X.21q r1 = r2.A07
        L_0x0127:
            X.21c r25 = X.C371421c.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r55.BDd()
            if (r0 == 0) goto L_0x0184
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r0 = r0.BEE()
            if (r0 == 0) goto L_0x0184
            int r0 = r0.ordinal()
            if (r0 != r9) goto L_0x0184
            X.21e r27 = X.C371621e.VERIFIED
        L_0x013d:
            X.21l r26 = X.C372321l.NOT_ENFORCED
            if (r2 == 0) goto L_0x0145
            boolean r9 = r2.A0L
            boolean r14 = r2.A0N
        L_0x0145:
            X.21r r24 = A01(r19)
            java.lang.Long r28 = java.lang.Long.valueOf(r17)
            java.util.ArrayList r35 = X.AnonymousClass001.A0s()
            X.599 r23 = X.AnonymousClass599.DEFAULT
            X.1RL r0 = new X.1RL
            r52 = r5
            r31 = r22
            r32 = r21
            r36 = r12
            r42 = r44
            r44 = r15
            r48 = r7
            r50 = r9
            r51 = r5
            r53 = r14
            r19 = r0
            r21 = r3
            r22 = r1
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r51, r52, r53)
            r0.A0J(r2)
            r11.A0H(r0, r10)
            if (r2 == 0) goto L_0x0183
            X.2sL r2 = r4.A06
            java.util.List r1 = X.C18290x4.A12(r0)
            r2.A0A(r1)
        L_0x0183:
            return r0
        L_0x0184:
            X.21e r27 = X.C371621e.NOT_VERIFIED
            goto L_0x013d
        L_0x0187:
            X.21q r1 = X.C372821q.GUEST
            goto L_0x0127
        L_0x018a:
            r33 = r34
            goto L_0x0109
        L_0x018e:
            X.2sH r0 = r4.A03
            long r46 = r0.A0H()
            goto L_0x00ff
        L_0x0196:
            r40 = -1
            goto L_0x00dd
        L_0x019a:
            r30 = r34
            goto L_0x00c7
        L_0x019e:
            r38 = -1
            goto L_0x00b7
        L_0x01a2:
            r12 = -1
            goto L_0x00a7
        L_0x01a6:
            r12 = r34
        L_0x01a8:
            r19 = r34
            if (r12 == 0) goto L_0x01ae
            goto L_0x0089
        L_0x01ae:
            r20 = r34
            if (r12 == 0) goto L_0x01b4
            goto L_0x0093
        L_0x01b4:
            X.2sH r0 = r4.A03
            long r17 = r0.A0H()
            goto L_0x00a3
        L_0x01bc:
            if (r15 == 0) goto L_0x01d0
            java.lang.String r0 = r15.BDZ()
        L_0x01c2:
            X.31A r3 = new X.31A
            r3.<init>((X.C95814uZ) r10)
            r3.A0W = r7
            r3.A0h = r0
            r0 = 4
            r3.A02 = r0
            goto L_0x0073
        L_0x01d0:
            r0 = r34
            goto L_0x01c2
        L_0x01d3:
            r15 = r34
            goto L_0x006f
        L_0x01d7:
            r0 = r34
            goto L_0x004b
        L_0x01db:
            r0 = r34
            goto L_0x0037
        L_0x01df:
            r2 = r34
            goto L_0x002d
        L_0x01e3:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162047r8.A08(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields):X.1RL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b8, code lost:
        if (r15 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01be, code lost:
        if (r15 != null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c4, code lost:
        if (r15 == null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01cd, code lost:
        if (r8 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01d3, code lost:
        if (r8 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (((X.AnonymousClass1RL) r3).A0M == false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RL A0A(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r51, X.C95804uY r52, boolean r53) {
        /*
            r50 = this;
            r0 = 0
            r12 = r52
            X.C162457s7.A0J(r12, r0)
            r11 = r51
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r15 = r11.BDd()
            r1 = r50
            X.2ss r10 = r1.A05
            X.31A r2 = r10.A0A(r12, r0)
            X.31A r9 = r1.A06(r2)
            boolean r2 = r9 instanceof X.AnonymousClass1RL
            r8 = 0
            if (r2 == 0) goto L_0x0030
            X.1RL r9 = (X.AnonymousClass1RL) r9
            if (r9 == 0) goto L_0x0031
            long r2 = r9.A00
            r5 = 0
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0031
            r0 = r53
            X.1RL r15 = r1.A07(r9, r11, r12, r0)
            return r15
        L_0x0030:
            r9 = r8
        L_0x0031:
            X.2sL r3 = r1.A06
            if (r15 == 0) goto L_0x01e5
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r15.B9u()
            if (r2 == 0) goto L_0x01e5
            java.lang.String r2 = r2.BDZ()
        L_0x003f:
            X.3Z6 r2 = r3.A07(r12, r2)
            java.lang.Object r6 = r2.first
            X.31A r6 = (X.AnonymousClass31A) r6
            java.lang.Object r2 = r2.second
            long r32 = X.C18310x6.A0B(r2)
            X.31A r3 = r10.A0A(r12, r0)
            boolean r2 = r3 instanceof X.AnonymousClass1RL
            if (r2 == 0) goto L_0x005d
            X.1RL r3 = (X.AnonymousClass1RL) r3
            boolean r2 = r3.A0M
            r47 = 1
            if (r2 != 0) goto L_0x005f
        L_0x005d:
            r47 = 0
        L_0x005f:
            if (r15 == 0) goto L_0x01e2
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r2 = r15.BBK()
        L_0x0065:
            X.7g4 r3 = A03(r2, r0)
            r2 = 1
            r7 = r8
            X.7Yo r5 = A02(r8, r3, r2)
            if (r15 == 0) goto L_0x01df
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r2 = r15.BBd()
        L_0x0075:
            X.7g4 r2 = A04(r2, r0)
            X.7Yo r4 = A02(r8, r2, r0)
            X.7qM r2 = r1.A0B
            r17 = r9
            r18 = r8
            r19 = r12
            r20 = r5
            r21 = r4
            r16 = r2
            r16.A05(r17, r18, r19, r20, r21)
            r44 = -1
            if (r9 == 0) goto L_0x009f
            long r2 = r9.A00
            int r12 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r12 != 0) goto L_0x009f
            X.4uZ r2 = r9.A05()
            r10.A0I(r2)
        L_0x009f:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r2 = r11.BDd()
            if (r2 == 0) goto L_0x01cc
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r8 = r2.BCu()
            if (r8 == 0) goto L_0x01cc
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r8.BBs()
            if (r2 == 0) goto L_0x01cc
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r14 = r2.BE9()
        L_0x00b5:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r8.BBs()
            if (r2 == 0) goto L_0x01d1
            X.6aY r16 = r2.B4i()
        L_0x00bf:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r2 = r8.BBs()
            if (r2 == 0) goto L_0x01d7
            java.lang.String r2 = r2.B7J()
            if (r2 == 0) goto L_0x01d7
            long r12 = java.lang.Long.parseLong(r2)
        L_0x00cf:
            if (r15 == 0) goto L_0x01b6
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r15.B9u()
            if (r2 == 0) goto L_0x01b6
            java.lang.String r25 = r2.BDZ()
        L_0x00db:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r2 = r15.B9u()
            if (r2 == 0) goto L_0x01bc
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x01bc
            long r34 = java.lang.Long.parseLong(r2)
        L_0x00eb:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r2 = r15.B6w()
            if (r2 == 0) goto L_0x01c2
            java.lang.String r26 = r2.BDZ()
        L_0x00f5:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r2 = r15.B6w()
            if (r2 == 0) goto L_0x01c8
            java.lang.String r2 = r2.getId()
            if (r2 == 0) goto L_0x01c8
            long r36 = java.lang.Long.parseLong(r2)
        L_0x0105:
            java.lang.String r10 = r5.A02
            long r8 = r5.A01
            java.lang.String r5 = r4.A02
            long r3 = r4.A01
            X.21c r21 = X.C371421c.PUBLIC
            if (r15 == 0) goto L_0x01a8
            java.lang.String r2 = r15.B6D()
            if (r2 == 0) goto L_0x01a8
            long r42 = java.lang.Long.parseLong(r2)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r42 = r42 * r1
        L_0x011f:
            java.lang.String r29 = r15.B7z()
            java.lang.String r30 = r15.B8T()
            java.lang.String r1 = r15.BDN()
            if (r1 == 0) goto L_0x0131
            long r44 = java.lang.Long.parseLong(r1)
        L_0x0131:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r1 = r11.BEO()
            if (r1 == 0) goto L_0x01a6
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r1 = r1.BCK()
        L_0x013b:
            X.21q r18 = A00(r1)
            if (r15 == 0) goto L_0x01a3
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r1 = r15.BEE()
            if (r1 == 0) goto L_0x01a3
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 != r1) goto L_0x01a3
            X.21e r23 = X.C371621e.VERIFIED
        L_0x0150:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r1 = r11.BEO()
            if (r1 == 0) goto L_0x015a
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r7 = r1.B9s()
        L_0x015a:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r1 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            boolean r46 = X.AnonymousClass000.A1Y(r7, r1)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r1 = r11.BDI()
            if (r1 == 0) goto L_0x01a0
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r1 = r1.BDy()
            if (r1 == 0) goto L_0x01a0
            int r1 = r1.ordinal()
            r2 = 1
            if (r1 == r2) goto L_0x01a0
            r2 = 2
            if (r1 == r2) goto L_0x019d
            r2 = 3
            if (r1 != r2) goto L_0x01a0
            X.21l r22 = X.C372321l.GEOSUSPENDED
        L_0x017b:
            X.21r r20 = A01(r14)
            java.lang.Long r24 = java.lang.Long.valueOf(r12)
            java.util.ArrayList r31 = X.AnonymousClass001.A0s()
            X.599 r19 = X.AnonymousClass599.DEFAULT
            X.1RL r15 = new X.1RL
            r49 = r0
            r27 = r10
            r28 = r5
            r38 = r8
            r40 = r3
            r48 = r0
            r17 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38, r40, r42, r44, r46, r47, r48, r49)
            return r15
        L_0x019d:
            X.21l r22 = X.C372321l.SUSPENDED
            goto L_0x017b
        L_0x01a0:
            X.21l r22 = X.C372321l.NOT_ENFORCED
            goto L_0x017b
        L_0x01a3:
            X.21e r23 = X.C371621e.NOT_VERIFIED
            goto L_0x0150
        L_0x01a6:
            r1 = r7
            goto L_0x013b
        L_0x01a8:
            X.2sH r1 = r1.A03
            long r42 = r1.A0H()
            if (r15 != 0) goto L_0x011f
            r29 = r7
            r30 = r7
            goto L_0x0131
        L_0x01b6:
            r25 = r7
            if (r15 == 0) goto L_0x01bc
            goto L_0x00db
        L_0x01bc:
            r34 = -1
            if (r15 == 0) goto L_0x01c2
            goto L_0x00eb
        L_0x01c2:
            r26 = r7
            if (r15 == 0) goto L_0x01c8
            goto L_0x00f5
        L_0x01c8:
            r36 = -1
            goto L_0x0105
        L_0x01cc:
            r14 = r7
            if (r8 == 0) goto L_0x01d1
            goto L_0x00b5
        L_0x01d1:
            r16 = r7
            if (r8 == 0) goto L_0x01d7
            goto L_0x00bf
        L_0x01d7:
            X.2sH r2 = r1.A03
            long r12 = r2.A0H()
            goto L_0x00cf
        L_0x01df:
            r2 = r8
            goto L_0x0075
        L_0x01e2:
            r2 = r8
            goto L_0x0065
        L_0x01e5:
            r2 = r8
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162047r8.A0A(com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.4uY, boolean):X.1RL");
    }

    public final NewsletterMetadataQueryImpl$Builder A0B(AnonymousClass1RL r5, XWA2NewsletterInput xWA2NewsletterInput, C157007hZ r7) {
        boolean z;
        C162457s7.A0J(r7, 1);
        boolean z2 = false;
        if (r5 != null) {
            z = AnonymousClass000.A1Y(r5.A07, C372821q.GUEST);
        } else {
            z = false;
        }
        if (r7.A0B && !z) {
            z2 = true;
        }
        NewsletterMetadataQueryImpl$Builder A0C = A0C(xWA2NewsletterInput, r7);
        A0C.A00.A01("fetch_viewer_metadata", Boolean.valueOf(z2));
        return A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x009b, code lost:
        if (r4.A09.A01.A0X(4887) == false) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder A0C(com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput r5, X.C157007hZ r6) {
        /*
            r4 = this;
            r0 = 0
            X.C162457s7.A0J(r6, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder r3 = new com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder
            r3.<init>()
            X.2ie r2 = r3.A00
            java.lang.String r0 = "input"
            r2.A00(r5, r0)
            r0 = 1
            r3.A01 = r0
            boolean r0 = r6.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_image"
            r2.A01(r0, r1)
            boolean r0 = r6.A01
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_preview"
            r2.A01(r0, r1)
            boolean r0 = r6.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_viewer_metadata"
            r2.A01(r0, r1)
            boolean r0 = r6.A08
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_state"
            r2.A01(r0, r1)
            boolean r0 = r6.A06
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_name"
            r2.A01(r0, r1)
            boolean r0 = r6.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_creation_time"
            r2.A01(r0, r1)
            boolean r0 = r6.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_description"
            r2.A01(r0, r1)
            boolean r0 = r6.A05
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_invite"
            r2.A01(r0, r1)
            boolean r0 = r6.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_handle"
            r2.A01(r0, r1)
            boolean r0 = r6.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_subscribers_count"
            r2.A01(r0, r1)
            boolean r0 = r6.A0A
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_verification"
            r2.A01(r0, r1)
            boolean r0 = r6.A07
            if (r0 == 0) goto L_0x009d
            X.5UP r0 = r4.A09
            X.1VX r1 = r0.A01
            r0 = 4887(0x1317, float:6.848E-42)
            boolean r1 = r1.A0X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x009e
        L_0x009d:
            r0 = 0
        L_0x009e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "fetch_settings"
            r2.A01(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162047r8.A0C(com.whatsapp.infra.graphql.generated.newsletter.calls.XWA2NewsletterInput, X.7hZ):com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataQueryImpl$Builder");
    }

    public final void A0D(C95814uZ r4) {
        this.A04.A0A(r4, false);
        this.A01.A0S(new C70123Zz(this, 0, r4));
    }

    public static final C372821q A00(GraphQLXWA2NewsletterRole graphQLXWA2NewsletterRole) {
        if (graphQLXWA2NewsletterRole != null) {
            int ordinal = graphQLXWA2NewsletterRole.ordinal();
            if (ordinal == 3) {
                return C372821q.SUBSCRIBED;
            }
            if (ordinal == 2) {
                return C372821q.ADMIN;
            }
            if (ordinal == 1) {
                return C372821q.OWNER;
            }
        }
        return C372821q.GUEST;
    }

    public static final C372921r A01(GraphQLXWA2NewsletterReactionCodesSettingValue graphQLXWA2NewsletterReactionCodesSettingValue) {
        if (graphQLXWA2NewsletterReactionCodesSettingValue != null) {
            int ordinal = graphQLXWA2NewsletterReactionCodesSettingValue.ordinal();
            if (ordinal == 1) {
                return C372921r.ALL;
            }
            if (ordinal != 2) {
                if (ordinal == 4) {
                    return C372921r.NONE;
                }
                if (ordinal == 3) {
                    return C372921r.BLOCKLIST;
                }
            }
        }
        return C372921r.DEFAULT;
    }

    public static final C156127g4 A03(NewsletterMetadataFields.ThreadMetadata.Picture picture, boolean z) {
        if (picture != null) {
            String B75 = picture.B75();
            if (!(B75 == null || B75.length() == 0)) {
                String id = picture.getId();
                picture.BDz();
                picture.BE7();
                return new C156127g4(id, picture.B75());
            }
        } else if (!z) {
            return null;
        }
        return new C136826nK();
    }

    public static final C156127g4 A04(NewsletterMetadataFields.ThreadMetadata.Preview preview, boolean z) {
        if (preview != null) {
            String B75 = preview.B75();
            if (!(B75 == null || B75.length() == 0)) {
                String id = preview.getId();
                preview.BDz();
                preview.BE7();
                return new C156127g4(id, preview.B75());
            }
        } else if (!z) {
            return null;
        }
        return new C136826nK();
    }

    public static final boolean A05(NewsletterMutationResponseFragmentImpl newsletterMutationResponseFragmentImpl) {
        Enum enumR;
        C153197aq A002;
        if (newsletterMutationResponseFragmentImpl == null || (A002 = newsletterMutationResponseFragmentImpl.A00(NewsletterMutationResponseFragmentImpl.NewsletterState.class, "newsletter_state")) == null) {
            enumR = null;
        } else {
            enumR = A002.A03(GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        return AnonymousClass000.A1Y(enumR, GraphQLXWA2NewsletterStateType.ACTIVE);
    }

    public final AnonymousClass31A A06(AnonymousClass31A r5) {
        if (r5 == null) {
            return null;
        }
        if (!(r5 instanceof AnonymousClass1RL)) {
            C55682qk r3 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18260x0.A1T(A0o, "Expected type NewsletterInfo but found type ", r5);
            r3.A0A("NewsletterGraphqlUtils/ChatsCache entry is not NewsletterInfo", true, A0o.toString());
        }
        return r5;
    }

    public final AnonymousClass1RL A09(NewsletterMetadataFields newsletterMetadataFields, C95804uY r5) {
        AnonymousClass1RL r2;
        AnonymousClass31A A062 = A06(this.A05.A0A(r5, false));
        if (!(A062 instanceof AnonymousClass1RL) || (r2 = (AnonymousClass1RL) A062) == null) {
            return null;
        }
        return A07(r2, newsletterMetadataFields, r5, false);
    }

    public C162047r8(C55682qk r2, C69263Wi r3, C29421in r4, C56612sH r5, C28871hu r6, C56982ss r7, C56652sL r8, C56662sM r9, AnonymousClass1VX r10, AnonymousClass5UP r11, C53942nv r12, C161747qM r13) {
        C18260x0.A0f(r5, r10, r3, r2, r7);
        C18260x0.A0W(r6, r8, r4);
        C162457s7.A0J(r11, 9);
        C18270x1.A13(r9, r12);
        this.A03 = r5;
        this.A08 = r10;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r6;
        this.A06 = r8;
        this.A02 = r4;
        this.A09 = r11;
        this.A0B = r13;
        this.A07 = r9;
        this.A0A = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0160, code lost:
        if (r7.A0N != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0162, code lost:
        r5 = r7.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x016c, code lost:
        if (r9.A08.A0X(6146) == false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0170, code lost:
        if (r6 == X.C372321l.NOT_ENFORCED) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0172, code lost:
        if (r6 == r5) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0174, code lost:
        r59 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0176, code lost:
        r34 = java.lang.Long.valueOf(r25);
        r32 = r7.A00;
        r28 = r7.A0O;
        r26 = r7.A0Q;
        r10 = r7.A0M;
        r9 = r7.A08;
        X.C162457s7.A0J(r13, 14);
        X.C162457s7.A0J(r8, 16);
        X.C162457s7.A0J(r6, 20);
        r4 = r24;
        X.C162457s7.A0J(r4, 22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01d6, code lost:
        return new X.AnonymousClass1RL(r23, r7, r13, r9, r4, r31, r6, r8, r34, r15, r14, r27, r30, r11, r12, r26, r32, r21, r19, r0, r2, r28, r17, r16, r10, false, r59);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d7, code lost:
        r59 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01da, code lost:
        r16 = r7.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e0, code lost:
        r8 = X.C371621e.NOT_VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e4, code lost:
        r8 = r7.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e8, code lost:
        r13 = r7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ec, code lost:
        r19 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f0, code lost:
        if (r11 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01f4, code lost:
        r17 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01fe, code lost:
        if (r11 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0210, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d5, code lost:
        if (r11 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f1, code lost:
        if (r14 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if (r11 != null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f7, code lost:
        r4 = r11.B6w();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fb, code lost:
        if (r4 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        r4 = r4.getId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0101, code lost:
        if (r4 == null) goto L_0x01ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        r19 = java.lang.Long.parseLong(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0107, code lost:
        r4 = r11.BDN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r4 == null) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x010d, code lost:
        r17 = java.lang.Long.parseLong(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0111, code lost:
        r31 = X.C371421c.PUBLIC;
        r4 = r62.BEO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0117, code lost:
        if (r4 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0119, code lost:
        r4 = r4.BCK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011d, code lost:
        if (r4 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011f, code lost:
        r13 = A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0123, code lost:
        if (r11 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0125, code lost:
        r4 = r11.BEE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0129, code lost:
        if (r4 == null) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0130, code lost:
        if (r4.ordinal() != 1) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0132, code lost:
        r8 = X.C371621e.VERIFIED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0134, code lost:
        r4 = r62.BEO();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0138, code lost:
        if (r4 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x013a, code lost:
        r5 = r4.B9s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x013e, code lost:
        if (r5 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0140, code lost:
        r16 = X.AnonymousClass000.A1Y(r5, com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0146, code lost:
        if (r11 == null) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0148, code lost:
        r12 = r11.B8T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x014c, code lost:
        if (r12 != null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014e, code lost:
        r12 = r7.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0150, code lost:
        if (r11 == null) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0152, code lost:
        r11 = r11.B7z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0156, code lost:
        if (r11 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0158, code lost:
        r11 = r7.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x015a, code lost:
        r30 = r10.A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1RL A07(X.AnonymousClass1RL r61, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields r62, X.C95804uY r63, boolean r64) {
        /*
            r60 = this;
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r62.BDd()
            r27 = 0
            if (r0 == 0) goto L_0x0224
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Picture r0 = r0.BBK()
        L_0x000c:
            r2 = r64
            X.7g4 r1 = A03(r0, r2)
            r0 = 1
            r7 = r61
            X.7Yo r5 = A02(r7, r1, r0)
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r62.BDd()
            if (r0 == 0) goto L_0x0220
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Preview r0 = r0.BBd()
        L_0x0023:
            X.7g4 r1 = A04(r0, r2)
            r0 = 0
            X.7Yo r10 = A02(r7, r1, r0)
            r9 = r60
            X.7qM r11 = r9.A0B
            r1 = r63
            r12 = r7
            r13 = r27
            r14 = r1
            r15 = r5
            r16 = r10
            r11.A05(r12, r13, r14, r15, r16)
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0048
            r0 = 0
            r7.A0K = r0
            X.2nv r0 = r9.A0A
            r0.A02(r1)
        L_0x0048:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r0 = r62.BDd()
            if (r0 == 0) goto L_0x021c
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings r1 = r0.BCu()
            if (r1 == 0) goto L_0x021d
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BBs()
            if (r0 == 0) goto L_0x021d
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterReactionCodesSettingValue r0 = r0.BE9()
        L_0x005e:
            X.21r r24 = A01(r0)
            if (r1 == 0) goto L_0x020e
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BBs()
            if (r0 == 0) goto L_0x020e
            X.6aY r23 = r0.B4i()
        L_0x006e:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Settings$ReactionCodes r0 = r1.BBs()
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = r0.B7J()
            if (r0 == 0) goto L_0x0214
            long r25 = java.lang.Long.parseLong(r0)
        L_0x007e:
            java.lang.Long r0 = r7.A0D
            if (r0 == 0) goto L_0x0094
            long r1 = r0.longValue()
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            X.21r r0 = r7.A09
            r24 = r0
            X.6aY r0 = r7.A06
            r23 = r0
            r25 = r1
        L_0x0094:
            long r2 = r10.A01
            long r0 = r5.A01
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00a0
            java.lang.String r4 = r5.A02
            r27 = r4
        L_0x00a0:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x00a6
            r0 = -1
        L_0x00a6:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$State r4 = r62.BDI()
            if (r4 == 0) goto L_0x020a
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r4 = r4.BDy()
            if (r4 == 0) goto L_0x020a
            int r5 = r4.ordinal()
            r4 = 1
            if (r5 == r4) goto L_0x0206
            r4 = 2
            if (r5 == r4) goto L_0x0202
            r4 = 3
            if (r5 != r4) goto L_0x020a
            X.21l r6 = X.C372321l.GEOSUSPENDED
        L_0x00c1:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata r11 = r62.BDd()
            if (r11 == 0) goto L_0x00d3
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r4 = r11.B9u()
            if (r4 == 0) goto L_0x00d3
            java.lang.String r15 = r4.BDZ()
            if (r15 != 0) goto L_0x00d7
        L_0x00d3:
            java.lang.String r15 = r7.A0H
            if (r11 == 0) goto L_0x01fa
        L_0x00d7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Name r4 = r11.B9u()
            if (r4 == 0) goto L_0x01fa
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x01fa
            long r21 = java.lang.Long.parseLong(r4)
        L_0x00e7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r4 = r11.B6w()
            if (r4 == 0) goto L_0x00f3
            java.lang.String r14 = r4.BDZ()
            if (r14 != 0) goto L_0x00f7
        L_0x00f3:
            java.lang.String r14 = r7.A0E
            if (r11 == 0) goto L_0x01ec
        L_0x00f7:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ThreadMetadata$Description r4 = r11.B6w()
            if (r4 == 0) goto L_0x01ec
            java.lang.String r4 = r4.getId()
            if (r4 == 0) goto L_0x01ec
            long r19 = java.lang.Long.parseLong(r4)
        L_0x0107:
            java.lang.String r4 = r11.BDN()
            if (r4 == 0) goto L_0x01f4
            long r17 = java.lang.Long.parseLong(r4)
        L_0x0111:
            X.21c r31 = X.C371421c.PUBLIC
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r4 = r62.BEO()
            if (r4 == 0) goto L_0x01e8
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r4 = r4.BCK()
            if (r4 == 0) goto L_0x01e8
            X.21q r13 = A00(r4)
        L_0x0123:
            if (r11 == 0) goto L_0x01e4
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterVerifyState r4 = r11.BEE()
            if (r4 == 0) goto L_0x01e4
            int r5 = r4.ordinal()
            r4 = 1
            if (r5 != r4) goto L_0x01e0
            X.21e r8 = X.C371621e.VERIFIED
        L_0x0134:
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields$ViewerMetadata r4 = r62.BEO()
            if (r4 == 0) goto L_0x01da
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r5 = r4.B9s()
            if (r5 == 0) goto L_0x01da
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting r4 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterMuteSetting.ON
            boolean r16 = X.AnonymousClass000.A1Y(r5, r4)
        L_0x0146:
            if (r11 == 0) goto L_0x014e
            java.lang.String r12 = r11.B8T()
            if (r12 != 0) goto L_0x0152
        L_0x014e:
            java.lang.String r12 = r7.A0G
            if (r11 == 0) goto L_0x0158
        L_0x0152:
            java.lang.String r11 = r11.B7z()
            if (r11 != 0) goto L_0x015a
        L_0x0158:
            java.lang.String r11 = r7.A0F
        L_0x015a:
            java.lang.String r4 = r10.A02
            r30 = r4
            boolean r4 = r7.A0N
            if (r4 != 0) goto L_0x0174
            X.21l r5 = r7.A0B
            X.1VX r9 = r9.A08
            r4 = 6146(0x1802, float:8.612E-42)
            boolean r4 = r9.A0X(r4)
            if (r4 == 0) goto L_0x01d7
            X.21l r4 = X.C372321l.NOT_ENFORCED
            if (r6 == r4) goto L_0x01d7
            if (r6 == r5) goto L_0x01d7
        L_0x0174:
            r59 = 1
        L_0x0176:
            java.lang.Long r34 = java.lang.Long.valueOf(r25)
            long r4 = r7.A00
            r32 = r4
            long r4 = r7.A0O
            r28 = r4
            java.util.List r4 = r7.A0Q
            r26 = r4
            boolean r4 = r7.A0M
            r10 = r4
            X.599 r9 = r7.A08
            r4 = 14
            X.C162457s7.A0J(r13, r4)
            r4 = 16
            X.C162457s7.A0J(r8, r4)
            r4 = 20
            X.C162457s7.A0J(r6, r4)
            r5 = 22
            r4 = r24
            X.C162457s7.A0J(r4, r5)
            r58 = 0
            X.1RL r25 = new X.1RL
            r36 = r14
            r37 = r27
            r38 = r30
            r39 = r11
            r40 = r12
            r41 = r26
            r42 = r32
            r44 = r21
            r46 = r19
            r48 = r0
            r50 = r2
            r52 = r28
            r54 = r17
            r56 = r16
            r57 = r10
            r26 = r23
            r27 = r7
            r28 = r13
            r29 = r9
            r30 = r4
            r32 = r6
            r33 = r8
            r35 = r15
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r46, r48, r50, r52, r54, r56, r57, r58, r59)
            return r25
        L_0x01d7:
            r59 = 0
            goto L_0x0176
        L_0x01da:
            boolean r4 = r7.A0L
            r16 = r4
            goto L_0x0146
        L_0x01e0:
            X.21e r8 = X.C371621e.NOT_VERIFIED
            goto L_0x0134
        L_0x01e4:
            X.21e r8 = r7.A0C
            goto L_0x0134
        L_0x01e8:
            X.21q r13 = r7.A07
            goto L_0x0123
        L_0x01ec:
            long r4 = r7.A01
            r19 = r4
            if (r11 == 0) goto L_0x01f4
            goto L_0x0107
        L_0x01f4:
            long r4 = r7.A05
            r17 = r4
            goto L_0x0111
        L_0x01fa:
            long r4 = r7.A02
            r21 = r4
            if (r11 == 0) goto L_0x00f3
            goto L_0x00e7
        L_0x0202:
            X.21l r6 = X.C372321l.SUSPENDED
            goto L_0x00c1
        L_0x0206:
            X.21l r6 = X.C372321l.NOT_ENFORCED
            goto L_0x00c1
        L_0x020a:
            X.21l r6 = r7.A0B
            goto L_0x00c1
        L_0x020e:
            r23 = r13
            if (r1 == 0) goto L_0x0214
            goto L_0x006e
        L_0x0214:
            X.2sH r0 = r9.A03
            long r25 = r0.A0H()
            goto L_0x007e
        L_0x021c:
            r1 = r13
        L_0x021d:
            r0 = r13
            goto L_0x005e
        L_0x0220:
            r0 = r27
            goto L_0x0023
        L_0x0224:
            r0 = r27
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162047r8.A07(X.1RL, com.whatsapp.infra.graphql.generated.newsletter.NewsletterMetadataFields, X.4uY, boolean):X.1RL");
    }

    public final void A0E(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C95814uZ A052 = ((AnonymousClass31A) it.next()).A05();
            C162457s7.A0D(A052);
            A0D(A052);
        }
    }
}
