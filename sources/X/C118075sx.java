package X;

import android.app.Activity;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.NewMediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import java.util.Collection;
import java.util.Set;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.5sx  reason: invalid class name and case insensitive filesystem */
public final class C118075sx implements AnonymousClass4C1 {
    public final int A00;
    public final C88834as A01;
    public final C88844at A02;
    public final C64333Db A03;

    public static C003203q A01(Activity activity) {
        try {
            C003203q r0 = (C003203q) activity;
            C615931l.A00(r0);
            return r0;
        } catch (ClassCastException e) {
            throw new IllegalStateException(AnonymousClass000.A0P(activity, "Expected activity to be a FragmentActivity: ", AnonymousClass001.A0o()), e);
        }
    }

    public static C08310eF A00(C116985rC r1) {
        Object A06 = r1.A06(new MediaPickerFragment());
        C162457s7.A0D(A06);
        C08310eF r0 = (C08310eF) A06;
        C615931l.A00(r0);
        return r0;
    }

    public static C102555Jh A04(C620633i r1, C620733j r2, AnonymousClass487 r3, AnonymousClass5Y0 r4, C60152y5 r5) {
        return new C102555Jh(r1, r2, r3, r4, r5);
    }

    public static AnonymousClass5KY A05() {
        return new AnonymousClass5KY();
    }

    public static AnonymousClass5LO A06() {
        return new AnonymousClass5LO();
    }

    public static AnonymousClass5JD A07() {
        return new AnonymousClass5JD();
    }

    public static C40312Fi A08() {
        return new C40312Fi();
    }

    public static GalleryTabHostFragment A09() {
        return new GalleryTabHostFragment();
    }

    public static NewMediaPickerFragment A0A() {
        return new NewMediaPickerFragment();
    }

    public static void A0C() {
    }

    public static void A0D() {
    }

    public final Object A0E() {
        switch (this.A00) {
            case 0:
                return new AnonymousClass5M4(this);
            case 1:
                return new AnonymousClass5M7(this);
            case 2:
                return new AnonymousClass5EI(this);
            case 3:
                return new C103815On((AnonymousClass1VX) this.A03.A07.get(), (AnonymousClass4FV) this.A03.ASY.get(), C72343dZ.A00(this.A03.A00.A1k));
            case 4:
                return new AnonymousClass5ET(this);
            case 5:
                return new C124026Ar(this, 0);
            case 6:
                return new C101355El(this);
            case 7:
                return new C101385Eo(this);
            case 8:
                return new C101425Es(this);
            case 9:
                return C129526aS.copyOf((Collection) A0B());
            case 10:
                return new C101475Ex(this);
            case 11:
                return new C100925Cu(this);
            case 12:
                return new C100945Cw(this);
            case 13:
                return new AnonymousClass5D3(this);
            case 14:
                AnonymousClass5UX r7 = (AnonymousClass5UX) this.A03.A6K.get();
                C620733j r11 = (C620733j) this.A03.AbU.get();
                C614930z r5 = (C614930z) this.A03.A0Q.get();
                C69253Wh r12 = (C69253Wh) this.A03.AJO.get();
                AnonymousClass33p r10 = (AnonymousClass33p) this.A03.Aaj.get();
                return new C105135Ts((C69263Wi) this.A03.AG7.get(), (C56972sr) this.A03.AJW.get(), r5, (AnonymousClass5XC) this.A03.A0U.get(), r7, (C613330g) this.A03.A6S.get(), (C54292oU) this.A03.AaB.get(), r10, r11, r12, (AnonymousClass4FS) this.A03.AbX.get());
            case 15:
                AnonymousClass4FV r6 = (AnonymousClass4FV) this.A03.ASY.get();
                C64773Ex r4 = (C64773Ex) this.A03.A6O.get();
                AnonymousClass3S3 r72 = (AnonymousClass3S3) this.A03.ARB.get();
                return new AnonymousClass5K3((C69263Wi) this.A03.AG7.get(), r4, (AnonymousClass1VX) this.A03.A07.get(), r6, r72, (AnonymousClass4FS) this.A03.AbX.get());
            case 16:
                AnonymousClass5SY A0W = this.A01.ACX();
                return new C104985Tc((C56612sH) this.A03.ASO.get(), (AnonymousClass33p) this.A03.Aaj.get(), (AnonymousClass1VX) this.A03.A07.get(), A0W);
            case 17:
                C620933l r3 = (C620933l) this.A03.APx.get();
                C1907099n r2 = (C1907099n) this.A03.AQ8.get();
                return new C193969Rb((AnonymousClass36F) this.A03.AQ1.get(), r3, r2, (AnonymousClass4FS) this.A03.AbX.get());
            case 18:
                return new C112715kB();
            case 19:
                C56982ss r52 = (C56982ss) this.A03.A5B.get();
                C66543Lv r62 = (C66543Lv) this.A03.A71.get();
                return new C102815Kj((C56612sH) this.A03.ASO.get(), (AnonymousClass33p) this.A03.Aaj.get(), r52, r62, (AnonymousClass1VX) this.A03.A07.get(), (AnonymousClass31C) this.A03.AKw.get(), (C56832sd) this.A03.AY6.get());
            case 20:
                return new C103215Lz(this);
            case 21:
                return new C44122Ut(this);
            case 22:
                C56972sr r32 = (C56972sr) this.A03.AJW.get();
                C40142Er r42 = (C40142Er) this.A03.A2h.get();
                AnonymousClass4C1 Abe = this.A03.A1T;
                return new AnonymousClass5ZD(r32, r42, (C56612sH) this.A03.ASO.get(), C72343dZ.A00(this.A03.A11), C72343dZ.A00(this.A03.A1W), Abe, this.A03.A1Y, this.A03.A1G);
            case 23:
                return new AnonymousClass4J1(this, 0);
            case 24:
                return new AnonymousClass4J3(this, 0);
            case 25:
                return new C101015Dd(this);
            case 26:
                return new C101075Dj(this);
            case 27:
                return new C101125Do(this);
            case 28:
                return new C101195Dv(this);
            case 29:
                return new C114695nS(this);
            case 30:
                return new C106945aQ((C56972sr) this.A03.AJW.get(), (C57162tC) this.A03.AaV.get(), (C56662sM) this.A03.AaX.get());
            case 31:
                return new AnonymousClass5M6(this);
            case 32:
                return new AnonymousClass5EC(this);
            case 33:
                return new C39492Ce(this);
            case 34:
                return new C26721cf();
            case 35:
                return new C95534tp();
            case 36:
                return new AnonymousClass5ED(this);
            case 37:
                return new AnonymousClass5EE(this);
            case 38:
                return new AnonymousClass5EF(this);
            case 39:
                return new C123936Ai(this, 0);
            case 40:
                return new C123946Aj(this, 0);
            case 41:
                return new C123956Ak(this, 0);
            case 42:
                return new C123966Al(this, 0);
            case 43:
                return new C123976Am(this, 0);
            case 44:
                return new C123986An(this, 0);
            case 45:
                return new C123996Ao(this, 0);
            case 46:
                return new C123926Ah(this, 0);
            case 47:
                return new C124006Ap(this, 0);
            case 48:
                return new C124016Aq(this, 0);
            case 49:
                return new AnonymousClass5EG(this);
            case 50:
                return new AnonymousClass5EH(this);
            case 51:
                return new AnonymousClass5EJ(this);
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                return new AnonymousClass5EK(this);
            case 53:
                return new AnonymousClass5EL(this);
            case 54:
                return new AnonymousClass5EM(this);
            case 55:
                return new AnonymousClass5EN(this);
            case 56:
                return new AnonymousClass5EO(this);
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass5EP(this);
            case 58:
                return new AnonymousClass5EQ(this);
            case 59:
                return new AnonymousClass5ER(this);
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                return new AnonymousClass5ES(this);
            case 61:
                return new AnonymousClass5EU(this);
            case 62:
                return new AnonymousClass5EV(this);
            case 63:
                return new AnonymousClass5EW(this);
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
                return new AnonymousClass5EX(this);
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass5EY(this);
            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                return new AnonymousClass5EZ(this);
            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                return new C101245Ea(this);
            case 68:
                return new C101255Eb(this);
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                return new C101265Ec(this);
            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                return new C101275Ed(this);
            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                return new C101285Ee(this);
            case 72:
                return new C101295Ef(this);
            case 73:
                return new C101305Eg(this);
            case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                return new C101315Eh(this);
            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                return new C101325Ei(this);
            case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
                return new C101335Ej(this);
            case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
                return new C101345Ek(this);
            case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                return new C124036As(this, 0);
            case 79:
                return new C124046At(this, 0);
            case 80:
                return new C124056Au(this, 0);
            case 81:
                return new C112145jG(this);
            case 82:
                return new C39502Cf(this);
            case 83:
                C54292oU r17 = (C54292oU) this.A03.AaB.get();
                C56612sH r16 = (C56612sH) this.A03.ASO.get();
                C52412lR A3g = this.A03.AkL();
                AnonymousClass5O9 A0S = this.A01.ACS();
                C102985La r1 = r18;
                AnonymousClass33p r322 = (AnonymousClass33p) this.A03.Aaj.get();
                AnonymousClass5O5 r24 = (AnonymousClass5O5) this.A03.A00.A2G.get();
                C105995Xf r26 = (C105995Xf) this.A03.A00.A2D.get();
                AnonymousClass5UM r27 = (AnonymousClass5UM) this.A03.A00.A2F.get();
                AnonymousClass54I r21 = (AnonymousClass54I) this.A03.A00.AB1.get();
                AnonymousClass30B r22 = (AnonymousClass30B) this.A03.A2K.get();
                AnonymousClass5TW r23 = (AnonymousClass5TW) this.A03.ASQ.get();
                C64393Dh r19 = (C64393Dh) this.A03.AS1.get();
                C69263Wi r20 = (C69263Wi) this.A03.AG7.get();
                C102985La r18 = new C102985La(r19, r20, r21, r22, r23, r24, this.A01.ABm(), r26, r27, (AnonymousClass5U6) this.A03.A00.A2h.get(), (C620633i) this.A03.AYG.get(), r16, r17, r322, (C620733j) this.A03.AbU.get(), A3g, (AnonymousClass1VX) this.A03.A07.get(), A0S, (C60152y5) this.A03.AVn.get(), (AnonymousClass4FS) this.A03.AbX.get(), (C97094xc) this.A03.A00.A29.get());
                return r18;
            case 84:
                C88834as.A3v();
                C88834as.A3w();
                GalleryTabHostFragment A09 = A09();
                A0D();
                return A09;
            case 85:
                return new C112565jw(this);
            case 86:
                return new C112555jv(this);
            case 87:
                return new C112575jx(this);
            case 88:
                return new AnonymousClass5M8(this);
            case 89:
                return new AnonymousClass5M9(this);
            case 90:
                return new C101365Em(this);
            case 91:
                return new C44162Ux(this);
            case 92:
                return new C101375En(this);
            case 93:
                return new C44172Uy(this);
            case 94:
                return new C44182Uz(this);
            case 95:
                C56832sd r112 = (C56832sd) this.A03.AY6.get();
                C66543Lv r8 = (C66543Lv) this.A03.A71.get();
                C50002hT r73 = (C50002hT) this.A03.AYs.get();
                C44902Xx r63 = (C44902Xx) this.A03.A7W.get();
                C183538qC A002 = C72343dZ.A00(this.A03.A6A);
                C49202g9 r102 = (C49202g9) this.A03.A6C.get();
                C40772Hr A7G = this.A03.Apn();
                return new C54032o4((C56612sH) this.A03.ASO.get(), this.A03.Aje(), (C40362Fn) this.A03.A7V.get(), r63, r73, r8, A7G, r102, r112, (AnonymousClass4FS) this.A03.AbX.get(), A002);
            case 96:
                return new AnonymousClass5MA(this);
            case 97:
                return new C101395Ep(this);
            case 98:
                return new C39512Cg(this);
            case 99:
                return new AnonymousClass2V0(this);
            default:
                throw new AssertionError(this.A00);
        }
    }

    public final Object A0F() {
        switch (this.A00) {
            case 100:
                return new C101405Eq(this);
            case 101:
                return new AnonymousClass2V1(this);
            case 102:
                return new C102005Hc((C56982ss) this.A03.A5B.get(), this.A03.Any());
            case 103:
                return new C101415Er(this);
            case 104:
                return new C112585jy(this);
            case 105:
                return new C39522Ch(this);
            case 106:
                return new AnonymousClass2V2(this);
            case 107:
                return new C101435Et(this);
            case C627136h.A03:
                return new C39532Ci(this);
            case 109:
                return new C101445Eu(this);
            case 110:
                return new C101455Ev(this);
            case 111:
                return new C101465Ew(this);
            case 112:
                return new C112655k5(this);
            case 113:
                return new C39542Cj(this);
            case 114:
                return new C39552Ck(this);
            case 115:
                return new C67343Ox(this);
            case 116:
                return new C44072Uo(this);
            case 117:
                return new C64603Ee(this);
            case 118:
                return new AnonymousClass2CI(this);
            case 119:
                return new C44082Up(this);
            case 120:
                return new C64613Ef(this);
            case 121:
                return new C44092Uq(this);
            case 122:
                return new AnonymousClass2CJ(this);
            case 123:
                return new AnonymousClass2CK(this);
            case 124:
                return new C103145Ls(this);
            case 125:
                return new AnonymousClass2CL(this);
            case 126:
                return new C59032wE(this);
            case 127:
                return new AnonymousClass2CM(this);
            case 128:
                return new C103155Lt(this);
            case 129:
                return new C103165Lu(this);
            case 130:
                return new C44102Ur(this);
            case 131:
                return new AnonymousClass2CN(this);
            case 132:
                return new C100935Cv(this);
            case 133:
                return new AnonymousClass2CO(this);
            case 134:
                return new C102055Hh(this.A03.Anh(), (AnonymousClass4FS) this.A03.AbX.get());
            case 135:
                return new C103175Lv(this);
            case 136:
                AnonymousClass33p r3 = (AnonymousClass33p) this.A03.Aaj.get();
                C29041iB r4 = (C29041iB) this.A03.A5l.get();
                return new C104285Qj((AnonymousClass64Q) this.A01.A31.get(), r3, r4, (AnonymousClass1VX) this.A03.A07.get(), (AnonymousClass4FV) this.A03.ASY.get(), (C56572sD) this.A03.AWF.get());
            case 137:
                AnonymousClass5C5 r0 = new AnonymousClass5C5();
                A0C();
                return r0;
            case 138:
                return new C100955Cx(this);
            case 139:
                return new C100965Cy(this);
            case 140:
                return new C103185Lw(this);
            case 141:
                return new C100975Cz(this);
            case 142:
                return new AnonymousClass5D0(this);
            case 143:
                return new AnonymousClass5D1(this);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new AnonymousClass3F9(this);
            case 145:
                return new AnonymousClass2CP(this);
            case 146:
                return new AnonymousClass2CQ(this);
            case 147:
                return new AnonymousClass5D2(this);
            case 148:
                C69263Wi r2 = (C69263Wi) this.A03.AG7.get();
                C1225864y A13 = this.A03.A00.AKG();
                C64773Ex r32 = (C64773Ex) this.A03.A6O.get();
                C66473Lo r7 = (C66473Lo) this.A03.A6p.get();
                return new AnonymousClass5OU(r2, r32, A13, (AnonymousClass5WE) this.A03.A00.A2k.get(), (C54292oU) this.A03.AaB.get(), r7, (AnonymousClass1VX) this.A03.A07.get());
            case 149:
                return new AnonymousClass5D4(this);
            case 150:
                return new AnonymousClass5D5(this);
            case 151:
                return new AnonymousClass5D6(this);
            case 152:
                return new C103195Lx(this);
            case 153:
                return new AnonymousClass5D7(this);
            case 154:
                return new AnonymousClass5D8(this);
            case 155:
                return new AnonymousClass5D9(this);
            case 156:
                return new AnonymousClass5DA(this);
            case 157:
                return new C59042wF(this);
            case 158:
                return new C103205Ly(this);
            case 159:
                return new AnonymousClass5M0(this);
            case 160:
                return new AnonymousClass5DB(this);
            case 161:
                return new AnonymousClass5DC(this);
            case 162:
                return new AnonymousClass2CR(this);
            case 163:
                return new C44112Us(this);
            case 164:
                return new AnonymousClass5DD(this);
            case 165:
                return new AnonymousClass2CS(this);
            case 166:
                return new AnonymousClass5DE(this);
            case 167:
                return new AnonymousClass5DF(this);
            case 168:
                return new AnonymousClass5DG(this);
            case 169:
                return new AnonymousClass5DH(this);
            case 170:
                return new AnonymousClass5DI(this);
            case 171:
                return new C112485jo(this);
            case 172:
                return new AnonymousClass5DJ(this);
            case 173:
                return new AnonymousClass5DK(this);
            case 174:
                AnonymousClass2WI A0Q = this.A01.ACP();
                C116905r3.A00(A0Q);
                return A0Q;
            case 175:
                return new AnonymousClass5M1(this);
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return new AnonymousClass5DL(this);
            case 177:
                return new AnonymousClass5DM(this);
            case 178:
                return new AnonymousClass5DN(this);
            case 179:
                return new AnonymousClass5DO(this);
            case 180:
                return new AnonymousClass5DP(this);
            case 181:
                return new C59292wg((C54872pQ) this.A01.A3c.get(), (C45992au) this.A03.A00.A5Q.get());
            case 182:
                C56972sr r22 = (C56972sr) this.A03.AJW.get();
                C620733j r42 = (C620733j) this.A03.AbU.get();
                AnonymousClass5P0 A0Y = this.A01.ACZ();
                return new C54872pQ(r22, (AnonymousClass33p) this.A03.Aaj.get(), r42, (C66473Lo) this.A03.A6p.get(), (AnonymousClass1VX) this.A03.A07.get(), A0Y);
            case 183:
                C88834as r1 = this.A01;
                AnonymousClass5JD A07 = A07();
                r1.ADg(A07);
                return A07;
            case 184:
                C88834as r12 = this.A01;
                AnonymousClass5LO A06 = A06();
                r12.ADf(A06);
                return A06;
            case 185:
                return new AnonymousClass5DQ(this);
            case 186:
                return new AnonymousClass5DR(this);
            case 187:
                return new AnonymousClass5DS(this);
            case 188:
                return new AnonymousClass5DT(this);
            case 189:
                return new AnonymousClass5DU(this);
            case 190:
                C88834as r13 = this.A01;
                AnonymousClass5KY A05 = A05();
                r13.ADe(A05);
                return A05;
            case 191:
                return new AnonymousClass5KJ((AnonymousClass1VX) this.A03.A07.get(), this.A03.A00.ANb(), C72343dZ.A00(this.A03.AbU), C72343dZ.A00(this.A03.AHN), C69693Ya.A00());
            case 192:
                C88834as r14 = this.A01;
                C40312Fi A08 = A08();
                r14.ADh(A08);
                return A08;
            case 193:
                return new AnonymousClass5DV(this);
            case 194:
                return new AnonymousClass4tt();
            case 195:
                return new C26791cm();
            case 196:
                return new AnonymousClass5DW(this);
            case 197:
                C88834as.A3v();
                C88834as.A3w();
                return A00(C116985rC.A02(A0A()));
            case 198:
                return new AnonymousClass4J2(this, 0);
            case 199:
                return new C114585nH(this);
            default:
                throw new AssertionError(this.A00);
        }
    }

    public final Object A0G() {
        switch (this.A00) {
            case 200:
                return new C44132Uu(this);
            case 201:
                return new AnonymousClass5DX(this);
            case 202:
                return new AnonymousClass5M2(this);
            case 203:
                return new AnonymousClass5DY(this);
            case 204:
                return new AnonymousClass5DZ(this);
            case 205:
                return new C100985Da(this);
            case 206:
                return new AnonymousClass3RE(this);
            case 207:
                return new AnonymousClass5M3(this);
            case 208:
                return new C100995Db(this);
            case 209:
                return new C101005Dc(this);
            case 210:
                return new C44142Uv(this);
            case 211:
                return new C101025De(this);
            case 212:
                return new C101035Df(this);
            case 213:
                return new C101045Dg(this);
            case 214:
                return new C101055Dh(this);
            case 215:
                return new C101065Di(this);
            case 216:
                return new C123856Aa(this, 0);
            case 217:
                return new AnonymousClass4JO(this, 0);
            case 218:
                return new AnonymousClass2CT(this);
            case 219:
                return new AnonymousClass2CU(this);
            case 220:
                return new AnonymousClass2CV(this);
            case 221:
                return new C191559Fj((C66663Mh) this.A03.AUd.get(), (C56612sH) this.A03.ASO.get(), (C66543Lv) this.A03.A71.get(), (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), this.A03.Apy());
            case 222:
                return new C191529Fg((C66663Mh) this.A03.AUd.get(), (C56612sH) this.A03.ASO.get(), (C66543Lv) this.A03.A71.get(), (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), this.A03.Apy());
            case 223:
                return new C191569Fk((C66663Mh) this.A03.AUd.get(), (C56612sH) this.A03.ASO.get(), (C66543Lv) this.A03.A71.get(), (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), this.A03.Apy());
            case 224:
                return new C191539Fh((C66663Mh) this.A03.AUd.get(), (C56612sH) this.A03.ASO.get(), (C66543Lv) this.A03.A71.get(), (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), this.A03.Apy());
            case 225:
                return new C191549Fi((C66663Mh) this.A03.AUd.get(), (C56612sH) this.A03.ASO.get(), (C66543Lv) this.A03.A71.get(), (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), this.A03.Apy());
            case 226:
                C66663Mh r3 = (C66663Mh) this.A03.AUd.get();
                C56612sH r5 = (C56612sH) this.A03.ASO.get();
                C66543Lv r7 = (C66543Lv) this.A03.A71.get();
                C45022Yj A7V = this.A03.Apy();
                AnonymousClass36F r8 = (AnonymousClass36F) this.A03.AQ1.get();
                return new C191579Fl(r3, (C64773Ex) this.A03.A6O.get(), r5, (C620733j) this.A03.AbU.get(), r7, r8, (AnonymousClass1VX) this.A03.A07.get(), (C203499no) this.A03.A00.A1J.get(), (C195219Wq) this.A03.AQK.get(), A7V);
            case 227:
                return new AnonymousClass2CW(this);
            case 228:
                return new AnonymousClass2CX(this);
            case 229:
                return new AnonymousClass2CY(this);
            case 230:
                return new AnonymousClass2CZ(this);
            case 231:
                return new C39452Ca(this);
            case 232:
                return new C101085Dk(this);
            case 233:
                return new C101095Dl(this);
            case 234:
                return new C101105Dm(this);
            case 235:
                return new C101115Dn(this);
            case 236:
                return new C101135Dp(this);
            case 237:
                return new C39462Cb(this);
            case 238:
                return new AnonymousClass3S9(this);
            case 239:
                return new AnonymousClass3SA(this);
            case 240:
                return new AnonymousClass3FZ((C56972sr) this.A03.AJW.get(), (C29441ip) this.A03.A68.get(), (C64723Er) this.A03.AFX.get(), (AnonymousClass4FV) this.A03.ASY.get(), C72343dZ.A00(this.A01.A4F));
            case 241:
                C129496aP builderWithExpectedSize = C129526aS.builderWithExpectedSize(18);
                C64333Db.AcK();
                builderWithExpectedSize.addAll(C116895r2.A00());
                builderWithExpectedSize.add((Object) this.A03.A00.AL2());
                builderWithExpectedSize.add((Object) this.A03.A00.AIm());
                builderWithExpectedSize.add((Object) this.A03.A00.AKy());
                builderWithExpectedSize.add((Object) this.A03.A00.AJW());
                builderWithExpectedSize.add((Object) this.A03.A00.AJy());
                builderWithExpectedSize.add((Object) this.A03.A00.ANA());
                builderWithExpectedSize.add((Object) this.A03.A00.AKz());
                builderWithExpectedSize.add((Object) this.A03.A00.AL0());
                builderWithExpectedSize.add((Object) this.A03.A00.ALj());
                builderWithExpectedSize.add((Object) this.A03.A00.AJG());
                builderWithExpectedSize.add((Object) this.A03.A00.AL3());
                builderWithExpectedSize.add((Object) this.A03.A00.AMg());
                builderWithExpectedSize.add((Object) this.A03.A00.AMX());
                builderWithExpectedSize.add((Object) this.A03.A00.AIe());
                builderWithExpectedSize.add((Object) this.A03.A00.ANj());
                builderWithExpectedSize.add((Object) this.A03.A00.AL1());
                builderWithExpectedSize.add((Object) this.A03.A00.APj());
                return builderWithExpectedSize.build();
            case 242:
                return new C48242ea((C48062eH) this.A03.A82.get());
            case 243:
                return new C44152Uw(this);
            case 244:
                return new C101145Dq(this);
            case 245:
                return new AnonymousClass5QH((C56492s4) this.A03.AWW.get(), (C29441ip) this.A03.A68.get(), (AnonymousClass5GH) this.A03.A00.A4J.get(), (AnonymousClass33K) this.A03.AaW.get());
            case 246:
                C49942hL A0f = this.A01.ADF();
                C116925r5.A00(A0f);
                return A0f;
            case 247:
                return new C101155Dr(this);
            case 248:
                return new C101165Ds(this);
            case 249:
                return new C101175Dt(this);
            case 250:
                return new C101185Du(this);
            case 251:
                return new C101205Dw(this);
            case 252:
                return new C101215Dx(this);
            case 253:
                return new C101225Dy(this);
            case 254:
                return new C101235Dz(this);
            case 255:
                return new AnonymousClass5E0(this);
            case 256:
                return new AnonymousClass5M5(this);
            case 257:
                return new AnonymousClass5E1(this);
            case 258:
                return new AnonymousClass5E2(this);
            case 259:
                return new AnonymousClass5E3(this);
            case 260:
                return new AnonymousClass5E4(this);
            case 261:
                C106975aT r32 = new C106975aT();
                return new C112475jn(this.A01.A4W, this.A01.ACM(), r32);
            case 262:
                C106975aT r72 = new C106975aT();
                AnonymousClass803 A0P = this.A01.ACM();
                return new C170928Fb((C003203q) this.A01.A4A.get(), this.A01.ABj(), this.A03.AkL(), A0P, r72, (AnonymousClass4FV) this.A03.ASY.get());
            case 263:
                return A01(this.A01.A4W);
            case 264:
                return new C102415It(C72343dZ.A00(this.A03.AEv), C72343dZ.A00(this.A01.A4G), C72343dZ.A00(this.A01.A3t));
            case 265:
                return new AnonymousClass2Z8((C39472Cc) this.A01.A20.get(), this.A03.AsW());
            case 266:
                return new C39472Cc(this);
            case 267:
                return new C26911cy();
            case 268:
                return new C39482Cd(this);
            case 269:
                return new C26921cz();
            case 270:
                C620633i r33 = (C620633i) this.A03.AYG.get();
                AnonymousClass5Y0 r1 = (AnonymousClass5Y0) this.A03.A8o.get();
                return A04(r33, (C620733j) this.A03.AbU.get(), (AnonymousClass487) this.A03.A00.A9c.get(), r1, (C60152y5) this.A03.AVn.get());
            case 271:
                C56612sH r43 = (C56612sH) this.A03.ASO.get();
                AnonymousClass1VX r42 = (AnonymousClass1VX) this.A03.A07.get();
                C105025Tg r41 = (C105025Tg) this.A03.AK5.get();
                C69263Wi r40 = (C69263Wi) this.A03.AG7.get();
                C56972sr r39 = (C56972sr) this.A03.AJW.get();
                AnonymousClass5Ul r38 = (AnonymousClass5Ul) this.A03.AUW.get();
                AnonymousClass4FS r37 = (AnonymousClass4FS) this.A03.AbX.get();
                C620233e r36 = (C620233e) this.A03.AWq.get();
                C621033m r35 = (C621033m) this.A03.AZL.get();
                C85244Fm r34 = (C85244Fm) this.A03.AJ2.get();
                C111095hX r332 = (C111095hX) this.A03.A0a.get();
                C114015mM r322 = (C114015mM) this.A03.A6T.get();
                C28071fd r31 = (C28071fd) this.A03.AJC.get();
                C104745Se r30 = (C104745Se) this.A03.Abv.get();
                AnonymousClass36Y r29 = (AnonymousClass36Y) this.A03.A7u.get();
                C64773Ex r28 = (C64773Ex) this.A03.A6O.get();
                C54012o2 r27 = (C54012o2) this.A03.ATM.get();
                AnonymousClass5ZU r26 = (AnonymousClass5ZU) this.A03.AaA.get();
                C620733j r25 = (C620733j) this.A03.AbU.get();
                C48132eP r24 = (C48132eP) this.A03.AJd.get();
                C114635nM r23 = (C114635nM) this.A03.AQW.get();
                C29421in r22 = (C29421in) this.A03.A6P.get();
                C66543Lv r21 = (C66543Lv) this.A03.A71.get();
                C55832qz r20 = (C55832qz) this.A03.AAY.get();
                C29431io r19 = (C29431io) this.A03.ALT.get();
                AnonymousClass5UP r18 = (AnonymousClass5UP) this.A03.ANe.get();
                AnonymousClass1R1 r17 = (AnonymousClass1R1) this.A03.A56.get();
                WfalManager wfalManager = (WfalManager) this.A03.AbR.get();
                C45662aN A5i = this.A03.A00.AQ9();
                C45042Yl Aq9 = this.A03.Aq9();
                C102335Il A5F = this.A03.A00.APZ();
                return new C103035Lf(C116985rC.A01(), C116985rC.A01(), C116985rC.A01(), r332, r40, r34, r39, r38, r35, wfalManager, (C29301ib) this.A03.A57.get(), r28, r22, r26, r322, (C106355Yq) this.A03.A00.A7P.get(), (C55262q4) this.A03.A5q.get(), (C620633i) this.A03.AYG.get(), r43, (AnonymousClass33p) this.A03.Aaj.get(), r25, r21, r19, r23, r27, r36, r29, r42, (AnonymousClass5U1) this.A03.A00.A7W.get(), (C29241iV) this.A03.AGn.get(), r31, (C56232re) this.A03.AUV.get(), r24, r18, (C50222hp) this.A03.AIA.get(), Aq9, r17, A5F, (C113995mK) this.A03.AWt.get(), (AnonymousClass5X9) this.A03.A00.ABC.get(), (C103005Lc) this.A03.A00.ABH.get(), r20, r41, r37, (C105215Ua) this.A03.A00.A3n.get(), A5i, (AnonymousClass5H2) this.A03.A00.A37.get(), (AnonymousClass5YA) this.A03.A00.ACM.get(), r30);
            case 272:
                return new AnonymousClass4XD((AnonymousClass5E5) this.A01.A22.get(), (AnonymousClass5E6) this.A01.A23.get(), (AnonymousClass5E7) this.A01.A24.get(), (AnonymousClass5E8) this.A01.A26.get(), (AnonymousClass5E9) this.A01.A27.get(), (AnonymousClass5EA) this.A01.A28.get(), (AnonymousClass5EB) this.A01.A29.get(), (AnonymousClass8GN) this.A03.A00.A9V.get(), (AnonymousClass1VX) this.A03.A07.get(), (C187958y5) this.A03.ASM.get());
            case 273:
                return new AnonymousClass5E5(this);
            case 274:
                return new AnonymousClass5E6(this);
            case 275:
                return new AnonymousClass5E7(this);
            case 276:
                return new AnonymousClass5E8(this);
            case 277:
                return new AnonymousClass5E9(this);
            case 278:
                return new AnonymousClass5EA(this);
            case 279:
                return new AnonymousClass5EB(this);
            default:
                throw new AssertionError(this.A00);
        }
    }

    public Object get() {
        int i = this.A00 / 100;
        if (i == 0) {
            return A0E();
        }
        if (i == 1) {
            return A0F();
        }
        if (i == 2) {
            return A0G();
        }
        throw new AssertionError(this.A00);
    }

    public C118075sx(C88834as r1, C88844at r2, C64333Db r3, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public static Set A0B() {
        return AnonymousClass002.A0K();
    }
}
