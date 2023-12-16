package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.3Lh  reason: invalid class name and case insensitive filesystem */
public class C66403Lh implements AnonymousClass485 {
    public final C116985rC A00;
    public final C116985rC A01;
    public final C55682qk A02;
    public final AnonymousClass2V7 A03;
    public final AnonymousClass2V8 A04;
    public final AnonymousClass2DJ A05;
    public final AnonymousClass2V9 A06;
    public final AnonymousClass2DK A07;
    public final AnonymousClass2VA A08;
    public final AnonymousClass2VB A09;
    public final AnonymousClass2VC A0A;
    public final AnonymousClass2DM A0B;
    public final AnonymousClass2DN A0C;
    public final C56972sr A0D;
    public final AnonymousClass3PX A0E;
    public final AnonymousClass3PN A0F;
    public final AnonymousClass3PO A0G;
    public final AnonymousClass3PK A0H;
    public final AnonymousClass3PL A0I;
    public final C58902w0 A0J;
    public final C64773Ex A0K;
    public final AnonymousClass5ZU A0L;
    public final AnonymousClass310 A0M;
    public final C56612sH A0N;
    public final C620733j A0O;
    public final C56982ss A0P;
    public final C56892sj A0Q;
    public final C61092zh A0R;
    public final C56662sM A0S;
    public final C617332a A0T;
    public final AnonymousClass3PQ A0U;
    public final C27721eR A0V;
    public final AnonymousClass1VX A0W;
    public final AnonymousClass3LP A0X;
    public final C66383Le A0Y;
    public final AnonymousClass3PR A0Z;
    public final AnonymousClass3PS A0a;
    public final AnonymousClass3PM A0b;
    public final AnonymousClass3PJ A0c;
    public final AnonymousClass3PY A0d;
    public final AnonymousClass3PT A0e;
    public final AnonymousClass3PU A0f;
    public final C57342tU A0g;
    public final AnonymousClass3PV A0h;
    public final AnonymousClass3PW A0i;
    public final C106685Zz A0j;
    public final C27701eP A0k;
    public final C196439aq A0l;
    public final AnonymousClass9U4 A0m;
    public final AnonymousClass9SN A0n;
    public final AnonymousClass3PP A0o;
    public final C27731eS A0p;
    public final AnonymousClass3PH A0q;
    public final C45012Yi A0r;
    public final C56832sd A0s;

    public C54192oK A01(C30341mI r11) {
        C54192oK r4;
        switch (r11.A00) {
            case 1:
                r4 = new C35951yS(this.A02, (C31611oZ) r11);
                break;
            case 4:
            case 12:
                r4 = new C36321z3(this.A02, this.A0D, r11);
                break;
            case 5:
            case 13:
                r4 = new C35931yQ(this.A02, r11);
                break;
            case 6:
                r4 = new C35891yM(this.A02, (C31331o7) r11);
                break;
            case 7:
            case 14:
                r4 = new C35941yR(this.A02, r11);
                break;
            case 9:
                r4 = new C36341z5(this.A02, (UserJid) null, (C31891p1) r11);
                break;
            case 10:
                r4 = new C36351z6(this.A02, this.A0S, (C31341o8) r11);
                break;
            case 11:
                int A062 = this.A0P.A06(AnonymousClass34R.A01(r11.A1J.A00));
                C55682qk r2 = this.A02;
                if (A062 != 3) {
                    r4 = new C35871yK(r2, r11);
                    break;
                } else {
                    r4 = new C36281yz(r2, this.A0R, (C31891p1) r11);
                    break;
                }
            case 15:
                r4 = new C35971yU(this.A02, (C31891p1) r11);
                break;
            case 16:
                r4 = new C35961yT(this.A02, (C31891p1) r11);
                break;
            case 17:
                r4 = new C35881yL(this.A02, r11);
                break;
            case 18:
                r4 = new C35981yV(this.A02, r11);
                break;
            case 20:
                r4 = new C27441dp(this.A02, this.A0D, (C31891p1) r11);
                break;
            case 21:
                r4 = new C35901yN(this.A02, r11);
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 34:
            case 35:
            case 36:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 55:
                r4 = new C36021yZ(this.A02, (C31201nu) r11);
                break;
            case 27:
                r4 = new C36531zO(this.A02, (C31891p1) r11);
                break;
            case 28:
                r4 = new C36311z2(this.A02, this.A0S, (C31341o8) r11);
                break;
            case 29:
            case 30:
            case 142:
                r4 = new C36151ym(this.A02, r11);
                break;
            case 31:
            case 32:
                r4 = new C36571zS(this.A02, r11);
                break;
            case 33:
                r4 = new C35831yG(this.A02);
                break;
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 44:
                r4 = new C36391zA(this.A02, this.A0l, r11);
                break;
            case 51:
                r4 = new C35911yO(this.A02, (C31891p1) r11);
                break;
            case AnonymousClass1ES.REVOKE_MESSAGE_TIMESTAMP_FIELD_NUMBER:
                r4 = new C35921yP(this.A02, (C31891p1) r11);
                break;
            case 53:
            case 54:
                r4 = new C36141yl(this.A02, r11);
                break;
            case 56:
            case 59:
                r4 = new C36061yd(this.A02, r11);
                break;
            case AnonymousClass1ES.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                r4 = new C36101yh(this.A02, (C31291o3) r11);
                break;
            case 58:
                r4 = new C35991yW(this.A02, (C31241ny) r11);
                break;
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                r4 = new C36131yk(this.A02, r11);
                break;
            case 61:
                r4 = new C36031ya(this.A02, (C31271o1) r11);
                break;
            case 62:
            case 63:
                r4 = new C36011yY(this.A02, r11);
                break;
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
            case AnonymousClass1EU.PTV_MESSAGE_FIELD_NUMBER:
                r4 = new C36231yu(this.A02, r11);
                break;
            case AnonymousClass1EU.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                r4 = new C36381z9(this.A02, this.A0X, (C31211nv) r11);
                break;
            case 68:
                r4 = new C36361z7(this.A02, this.A0D, r11);
                break;
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                r4 = new C36041yb(this.A02, (C31271o1) r11);
                break;
            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                r4 = new C36191yq(this.A02, r11);
                break;
            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                r4 = new C36111yi(this.A02, (C31061ng) r11);
                break;
            case 73:
            case AnonymousClass1EU.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                r4 = new C36331z4(this.A02, AnonymousClass32V.A00(r11.A1J.A00), r11);
                break;
            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
                r4 = new C36421zD(this.A02, this.A0K, this.A0L, (C31891p1) r11, this.A0s);
                break;
            case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
                C64333Db r1 = this.A05.A00.A01;
                r4 = new AnonymousClass1Ny(C64333Db.A01(r1), C64333Db.A39(r1), (C61092zh) r1.AXN.get(), (C31581oW) r11, (C56832sd) r1.AY6.get());
                break;
            case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                C64333Db r12 = this.A0B.A00.A01;
                r4 = new AnonymousClass1Nz(C64333Db.A01(r12), C64333Db.A39(r12), (C61092zh) r12.AXN.get(), (C31581oW) r11, (C56832sd) r12.AY6.get());
                break;
            case 79:
                r4 = new C27431do(this.A02, this.A0D, (C31891p1) r11);
                break;
            case 80:
                r4 = new C36121yj(this.A02, r11);
                break;
            case 81:
                r4 = new C36091yg(this.A02, (C31891p1) r11);
                break;
            case 82:
                r4 = new C36081yf(this.A02, (C31891p1) r11);
                break;
            case 83:
                r4 = new C36181yp(this.A02, r11);
                break;
            case 84:
            case 85:
                r4 = new C36171yo(this.A02, r11);
                break;
            case 87:
                r4 = new C36291z0(this.A02, (C31891p1) r11, this.A0s);
                break;
            case 88:
                C64333Db r13 = this.A07.A00.A01;
                r4 = new AnonymousClass1O0(C64333Db.A01(r13), C64333Db.A39(r13), (C61092zh) r13.AXN.get(), (C31581oW) r11, (C56832sd) r13.AY6.get());
                break;
            case 89:
                C64333Db r14 = this.A0C.A00.A01;
                r4 = new AnonymousClass1O1(C64333Db.A01(r14), C64333Db.A39(r14), (C61092zh) r14.AXN.get(), (C31581oW) r11, (C56832sd) r14.AY6.get());
                break;
            case 90:
            case 106:
                r4 = new C27461dr(this.A02, this.A0D, this.A0P, this.A0R, (C31891p1) r11);
                break;
            case 91:
            case 92:
                r4 = new C36161yn(this.A02, r11);
                break;
            case 95:
                r4 = new C36441zF(this.A02, this.A0K, this.A0L, (C31571oV) r11, this.A0s);
                break;
            case 96:
                r4 = new C35841yH(this.A02);
                break;
            case 97:
                r4 = new C36071ye(this.A02, (C31281o2) r11);
                break;
            case 98:
            case 105:
                r4 = new C36411zC(this.A02, this.A0P, this.A0W, (C31891p1) r11);
                break;
            case 99:
                r4 = new C35851yI(this.A02);
                break;
            case 100:
                r4 = new C36301z1(this.A02, (C31891p1) r11, this.A0s);
                break;
            case 101:
                if (r11.A19() != null && r11.A19().size() == 1) {
                    C56972sr r6 = this.A0D;
                    if (r6.A0a((C95814uZ) C18290x4.A0k(r11.A19()))) {
                        r4 = new C27471ds(this.A02, r6, this.A0P, this.A0R, (C31891p1) r11);
                        break;
                    }
                }
                r4 = new C27451dq(this.A02, this.A0D, (C31891p1) r11);
                break;
            case 102:
            case 103:
            case 104:
                r4 = new C36371z8(this.A02, (C31811ot) r11);
                break;
            case 107:
                r4 = new C35861yJ(this.A02, (C31891p1) r11);
                break;
            case C627136h.A03:
                r4 = this.A03.A00((C31721ok) r11);
                break;
            case 109:
                r4 = this.A08.A00((C31731ol) r11);
                break;
            case 110:
                r4 = this.A09.A00((C31741om) r11);
                break;
            case 111:
                r4 = this.A0A.A00((C31751on) r11);
                break;
            case 112:
            case 113:
            case 114:
                r4 = this.A04.A00((C31861oy) r11);
                break;
            case 116:
                r4 = this.A06.A00((C31651od) r11);
                break;
            case 117:
                r4 = new C36261yx(this.A02, (C31311o5) r11);
                break;
            case 118:
                r4 = new C36241yv(this.A02, r11);
                break;
            case 120:
                r4 = new C36201yr(this.A02, r11);
                break;
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                r4 = new C36401zB(this.A02, this.A0P, (C31871oz) r11, this.A0s);
                break;
            case 131:
                r4 = new C36521zN(this.A02, (C31891p1) r11);
                break;
            case 135:
                r4 = new C36211ys(this.A02, r11);
                break;
            case 136:
                r4 = new C36221yt(this.A02, r11);
                break;
            case 137:
            case 138:
                r4 = new C36581zT(this.A02, r11);
                break;
            case 140:
            case 141:
                r4 = new C36501zL(this.A02, this.A0Q, r11);
                break;
            case 143:
                r4 = new C36431zE(this.A02, this.A0P, this.A0Q, (C31471oL) r11, this.A0s);
                break;
            case 147:
            case 155:
                r4 = new C36001yX(this.A02, r11);
                break;
            case 148:
            case 149:
                r4 = new C36511zM(this.A02, this.A0P, r11, this.A0s);
                break;
            case 150:
            case 151:
                r4 = new C36591zU(this.A02, r11);
                break;
            case 152:
                r4 = new C36561zR(this.A02, this.A0P, r11);
                break;
            case 156:
                r4 = new C36491zK(this.A02, r11);
                break;
            case 162:
                r4 = new C36251yw(this.A02, (C31231nx) r11);
                break;
            case 165:
                r4 = new C36271yy(this.A02, (C31181ns) r11);
                break;
            default:
                return null;
        }
        AnonymousClass2z0 r22 = r11.A1J;
        r4.A09 = r22.A01;
        r4.A04 = r11.A0K;
        r4.A05 = r22.A00;
        r4.A0E = r22.A02;
        return r4;
    }

    public C54192oK A00(AnonymousClass23Q r15) {
        switch (r15.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            case 18:
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
            case 61:
            case AnonymousClass1EU.POLL_CREATION_MESSAGE_V3_FIELD_NUMBER:
            case AnonymousClass1EU.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
            case 99:
            case 100:
                return new C36021yZ(this.A02, (C31201nu) null);
            case 20:
                return new C35871yK(this.A02, (C30341mI) null);
            case 21:
                return new C35951yS(this.A02, (C31611oZ) null);
            case 22:
                return new C35891yM(this.A02, (C31331o7) null);
            case 23:
                return new C35901yN(this.A02, (C30341mI) null);
            case 24:
                return new C36531zO(this.A02, (C31891p1) null);
            case 25:
                return new C36151ym(this.A02, (C30341mI) null);
            case 26:
                return new C36571zS(this.A02, (C30341mI) null);
            case 27:
            case 35:
                return new C36321z3(this.A02, this.A0D, (C30341mI) null);
            case 28:
            case 36:
                return new C35941yR(this.A02, (C30341mI) null);
            case 29:
                return new C35971yU(this.A02, (C31891p1) null);
            case 30:
                return new C35961yT(this.A02, (C31891p1) null);
            case 31:
                return new C27441dp(this.A02, this.A0D, (C31891p1) null);
            case 32:
                return new C35931yQ(this.A02, (C30341mI) null);
            case 33:
                return new C36351z6(this.A02, this.A0S, (C31341o8) null);
            case 34:
                return new C36341z5(this.A02, C56972sr.A04(this.A0D), (C31891p1) null);
            case 38:
                return new C35981yV(this.A02, (C30341mI) null);
            case 39:
            case 79:
            case 81:
            case 84:
            case 86:
            case 94:
            case 96:
            case 126:
            case 127:
                return new C36381z9(this.A02, this.A0X, (C31211nv) null);
            case 42:
                return new C36311z2(this.A02, this.A0S, (C31341o8) null);
            case 43:
                return new C35881yL(this.A02, (C30341mI) null);
            case 44:
                return new C35831yG(this.A02);
            case 54:
            case 55:
            case 56:
                return new C36391zA(this.A02, this.A0l, (C30341mI) null);
            case AnonymousClass1EU.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                return new C36141yl(this.A02, (C30341mI) null);
            case AnonymousClass1EU.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                return new C35911yO(this.A02, (C31891p1) null);
            case AnonymousClass1EU.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                return new C35921yP(this.A02, (C31891p1) null);
            case 72:
                return new C36061yd(this.A02, (C30341mI) null);
            case 73:
                return new C36101yh(this.A02, (C31291o3) null);
            case AnonymousClass1EU.EVENT_MESSAGE_FIELD_NUMBER:
            case 128:
            case 129:
                return new C36041yb(this.A02, (C31271o1) null);
            case AnonymousClass1EU.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER:
            case AnonymousClass1EU.COMMENT_MESSAGE_FIELD_NUMBER:
            case AnonymousClass1EU.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
            case 80:
            case 82:
            case 83:
            case 85:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 95:
            case 97:
            case 98:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case C627136h.A03:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
                return new C36031ya(this.A02, (C31271o1) null);
            case 118:
                return new C36011yY(this.A02, (C30341mI) null);
            case 122:
                return new C35991yW(this.A02, (C31241ny) null);
            case 123:
                return new C36131yk(this.A02, (C30341mI) null);
            case 130:
                return new C36361z7(this.A02, this.A0D, (C30341mI) null);
            case 131:
                return new C36111yi(this.A02, (C31061ng) null);
            case 133:
                return new C36331z4(this.A02, (GroupJid) null, (C30341mI) null);
            case 134:
                return this.A04.A00((C31861oy) null);
            case 135:
                return this.A03.A00((C31721ok) null);
            case 136:
                return this.A09.A00((C31741om) null);
            case 137:
                return this.A06.A00((C31651od) null);
            case 138:
                return this.A08.A00((C31731ol) null);
            case 139:
                return this.A0A.A00((C31751on) null);
            case 141:
                return new C27431do(this.A02, this.A0D, (C31891p1) null);
            case 142:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 185:
                return new C36401zB(this.A02, this.A0P, (C31871oz) null, this.A0s);
            case 143:
                return new C36121yj(this.A02, (C30341mI) null);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new C36181yp(this.A02, (C30341mI) null);
            case 145:
                return new C36171yo(this.A02, (C30341mI) null);
            case 146:
                return new C36411zC(this.A02, this.A0P, this.A0W, (C31891p1) null);
            case 147:
                return new C36091yg(this.A02, (C31891p1) null);
            case 148:
                return new C36081yf(this.A02, (C31891p1) null);
            case 149:
                return new C36291z0(this.A02, (C31891p1) null, this.A0s);
            case 150:
                return new C36371z8(this.A02, (C31811ot) null);
            case 151:
                return new C27461dr(this.A02, this.A0D, this.A0P, this.A0R, (C31891p1) null);
            case 152:
                return new C35841yH(this.A02);
            case 154:
                return new C36071ye(this.A02, (C31281o2) null);
            case 157:
                return new C35851yI(this.A02);
            case 158:
                return new C35861yJ(this.A02, (C31891p1) null);
            case 159:
                return new C27471ds(this.A02, this.A0D, this.A0P, this.A0R, (C31891p1) null);
            case 161:
                return new C27451dq(this.A02, this.A0D, (C31891p1) null);
            case 162:
                return new C36261yx(this.A02, (C31311o5) null);
            case 171:
                return new C36161yn(this.A02, (C30341mI) null);
            case 172:
                return new C36201yr(this.A02, (C30341mI) null);
            case 173:
                return new C36521zN(this.A02, (C31891p1) null);
            case 174:
                return new C36221yt(this.A02, (C30341mI) null);
            case 175:
                return new C36211ys(this.A02, (C30341mI) null);
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return new C36581zT(this.A02, (C30341mI) null);
            case 177:
                return new C36241yv(this.A02, (C30341mI) null);
            case 178:
            case 179:
            case 180:
                return new C36231yu(this.A02, (C30341mI) null);
            case 181:
                return new C36191yq(this.A02, (C30341mI) null);
            case 182:
                return new C36501zL(this.A02, this.A0Q, (C30341mI) null);
            case 183:
                return new C36431zE(this.A02, this.A0P, this.A0Q, (C31471oL) null, this.A0s);
            case 186:
                return new C36591zU(this.A02, (C30341mI) null);
            case 188:
                return new C36511zM(this.A02, this.A0P, (C30341mI) null, this.A0s);
            case 189:
                return new C36561zR(this.A02, this.A0P, (C30341mI) null);
            case 191:
            case 196:
                return new C36001yX(this.A02, (C30341mI) null);
            case 192:
                C55682qk r1 = this.A02;
                C162457s7.A0J(r1, 1);
                return new C36271yy(r1, (C31181ns) null);
            case 195:
                return new C36491zK(this.A02, (C30341mI) null);
            case 197:
                return new C36251yw(this.A02, (C31231nx) null);
            default:
                return null;
        }
    }

    public C66403Lh(C116985rC r2, C116985rC r3, C55682qk r4, AnonymousClass2V7 r5, AnonymousClass2V8 r6, AnonymousClass2DJ r7, AnonymousClass2V9 r8, AnonymousClass2DK r9, AnonymousClass2VA r10, AnonymousClass2VB r11, AnonymousClass2VC r12, AnonymousClass2DM r13, AnonymousClass2DN r14, C56972sr r15, AnonymousClass3PX r16, AnonymousClass3PN r17, AnonymousClass3PO r18, AnonymousClass3PK r19, AnonymousClass3PL r20, C58902w0 r21, C64773Ex r22, AnonymousClass5ZU r23, AnonymousClass310 r24, C56612sH r25, C620733j r26, C56982ss r27, C56892sj r28, C61092zh r29, C56662sM r30, C617332a r31, AnonymousClass3PQ r32, C27721eR r33, AnonymousClass1VX r34, AnonymousClass3LP r35, C66383Le r36, AnonymousClass3PR r37, AnonymousClass3PS r38, AnonymousClass3PM r39, AnonymousClass3PJ r40, AnonymousClass3PY r41, AnonymousClass3PT r42, AnonymousClass3PU r43, C57342tU r44, AnonymousClass3PV r45, AnonymousClass3PW r46, C106685Zz r47, C27701eP r48, C196439aq r49, AnonymousClass9U4 r50, AnonymousClass9SN r51, AnonymousClass3PP r52, C27731eS r53, AnonymousClass3PH r54, C45012Yi r55, C56832sd r56) {
        this.A0N = r25;
        this.A0W = r34;
        this.A02 = r4;
        this.A0D = r15;
        this.A0P = r27;
        this.A0j = r47;
        this.A0M = r24;
        this.A0X = r35;
        this.A0R = r29;
        this.A0K = r22;
        this.A0L = r23;
        this.A0O = r26;
        this.A0m = r50;
        this.A0n = r51;
        this.A0S = r30;
        this.A0g = r44;
        this.A01 = r2;
        this.A00 = r3;
        this.A0s = r56;
        this.A0J = r21;
        this.A0r = r55;
        this.A0l = r49;
        this.A0T = r31;
        this.A0Q = r28;
        this.A0p = r53;
        this.A0V = r33;
        this.A0c = r40;
        this.A0i = r46;
        this.A0F = r17;
        this.A0G = r18;
        this.A0E = r16;
        this.A0Y = r36;
        this.A0e = r42;
        this.A0d = r41;
        this.A0h = r45;
        this.A0H = r19;
        this.A0I = r20;
        this.A0Z = r37;
        this.A0q = r54;
        this.A0k = r48;
        this.A03 = r5;
        this.A0f = r43;
        this.A0o = r52;
        this.A0U = r32;
        this.A0b = r39;
        this.A0a = r38;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = r12;
        this.A0B = r13;
        this.A0C = r14;
    }
}
