package X;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: X.6UJ  reason: invalid class name */
public abstract class AnonymousClass6UJ extends AnonymousClass6WK {
    public final int A00;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C187068wR)) {
            try {
                AnonymousClass6UJ r5 = (AnonymousClass6UJ) ((C187068wR) obj);
                if (r5.A00 == this.A00) {
                    return Arrays.equals(A02(), (byte[]) AnonymousClass6UT.A01(new AnonymousClass6UT(r5.A02())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw AnonymousClass0x9.A0i(e);
        }
    }

    public byte[] A02() {
        byte[] bArr;
        String str;
        if (!(this instanceof AnonymousClass6US)) {
            return ((AnonymousClass6UN) this).A00;
        }
        AnonymousClass6US r2 = (AnonymousClass6US) this;
        synchronized (r2) {
            bArr = (byte[]) r2.A00.get();
            if (bArr == null) {
                if (r2 instanceof AnonymousClass6UR) {
                    str = "0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u001e\u0017\r080415233656Z\u0017\r350901233656Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000ÖÎ.\b\n¿â1MÑ³ÏÓ\u0018\\´=3ú\ftá½¶ÑÛ\u0013ö,\\9ßVøF=e¾ÀóÊBk\u0007Å¨íZ9ÁgçkÉ¹'K\u000b\"\u0000\u0019©)\u0015årÅm*0\u001b£oÅü\u0011:ÖËt5¡m#«}úîáeäß\u001f\n½§\nQlN\u0005\u0011Ê|\fU\u0017[ÃuùHÅj®\b¤O¦¤Ý}¿,\n5\"­\u0006¸Ì\u0018^±Uyîøm\b\u000b\u001daÀù¯±ÂëÑ\u0007êE«Ûh£Ç^TÇlSÔ\u000b\u0012\u001dç»Ó\u000eb\f\u0018áªaÛ¼Ý<d_/UóÔÃuì@p©?qQØ6pÁj\u001a¾^òÑ\u0018á¸®ó)ðf¿láD¬èm\u001c\u001b\u000f\u0002\u0001\u0003£ü0ù0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²0É\u0006\u0003U\u001d#\u0004Á0¾\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²¡¤01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com\t\u0000Õ¸l}ÓNõ0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000\u0019Ó\fñ\u0005ûx?L\r}Ò##=@zÏÎ\u0000\b\u001d[×ÆéÖí k\u000e\u0011 \u0006Al¢D\u0013ÒkJ àõ$ÊÒ»\\nL¡\u0001j\u0015n¡ì]ÉZ^:\u0001\u00006ôHÕ\u0010¿.\u001eag:;åm¯\u000bw±Â)ãÂUãèL]#ïº\tËñ; +NZ\"É2cHJ#Òü)ú\u00199u3¯Øª\u0016\u000fBÂÐ\u0016>fCéÁ/ Á33[Àÿk\"ÞÑ­DB)¥9©Nï­«ÐeÎÒK>QåÝ{fx{ï\u0012þû¤Ä#ûOøÌIL\u0002ðõ\u0005\u0016\u0012ÿe)9>FêÅ»!òwÁQª_*¦'Ñè§\n¶\u00035iÞ;¿ÿ|©Ú>\u0012Cö\u000b";
                } else if (r2 instanceof AnonymousClass6UQ) {
                    str = "0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r080821231334Z\u0017\r360107231334Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000«V.\u0000Ø;¢\b®\no\u0012N)Ú\u0011ò«VÐXâÌ©\u0013\u0003é·TÓrö@§\u001b\u001dË\u0013\tgbNFV§wj\u0019=²å¿·$©\u001ew\u0018\u000ejG¤;3Ù`w\u00181EÌß{.XftÉáV[\u001fLjYU¿òQ¦=«ùÅ\\'\"\"Rèuäø\u0015Jd_qhÀ±¿Æ\u0012ê¿xWi»4ªyÜ~.¢vL®\u0007ØÁqT×î_d¥\u001aD¦\u0002ÂI\u0005AWÜ\u0002Í_\\\u000eUûï\u0019ûã'ð±Q\u0016Å o\u0019ÑõÄÛÂÖ¹?hÌ)yÇ\u000e\u0018«k;ÕÛU*\u000e;LßXûíÁº5à\u0003Á´±\rÒD¨î$ÿý38r«R!^Ú°ü\r\u000b\u0014[j¡y\u0002\u0001\u0003£Ù0Ö0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014Ç}Â!\u0017V%Óßkãä×¥0¦\u0006\u0003U\u001d#\u00040\u0014Ç}Â!\u0017V%Óßkãä×¥¡x¤v0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android\t\u0000ÂàFdJ00\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000mÒRÎï0,6\nªÎÏòÌ©\u0004»]z\u0016aø®F²B\u0004ÐÿJhÇí\u001aS\u001eÄYZb<æ\u0007c±g)zzãW\u0012Ä\u0007ò\bðË\u0010)\u0012M{\u0010b\u0019ÀÊ>³ù­_¸qï&âñmDÈÙ l²ð\u0005»?âËD~s\u0010v­E³?`\tê\u0019Áaæ&Aª'\u001dýR(ÅÅ]ÛE'XÖaöÌ\fÌ·5.BLÄ6\\R52÷2Q7Y<JãAôÛAíÚ\r\u000b\u0010q§Ä@ðþ \u001c¶'ÊgCiÐ½/Ù\u0011ÿ\u0006Í¿,ú\u0010Ü\u000f:ãWbHÇïÆLqD\u0017B÷\u0005ÉÞW:õ[9\r×ý¹A1]_u0\u0011&ÿb\u0014\u0010Ài0";
                } else if (r2 instanceof AnonymousClass6UP) {
                    str = "0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkìÇ!?<D`/¯e0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1-0+\u0006\u0003U\u0004\u0003\f$com_google_android_gms-rotation-20200 \u0017\r200309195702Z\u0018\u000f20500309195702Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1-0+\u0006\u0003U\u0004\u0003\f$com_google_android_gms-rotation-20200\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000¶ÒDÒ#ÅÐÌ&\u0006)JãûIOÆv'5ÌJ\u001bD/ÅäSå«pìæÊÝ\u001dë0Ï\u0018CÒ?\u0012#ÐÚ\u0016¤·\u001cßÓ°ÆÑjÚ Úeû|²IM\u0011\"èçïà¥0os&Õ³s\u0005\u0018ËT\u0011E|þ=LGù\u0005j}ü_K\u0010`g\u000fO\u0010sªÄMkÓUjs£=¥Úì:Eª\u0019\u0000Èß0y¤Î>g×3\u001b®Þêõ,Z¢,$b¬)ÆYäpý\fD\u000e<Æ§Á\u0001¡,Mc,lûJ|k¸%\u000f`\u0000§UTTiÄÃÕ®Â9É~ëÒ^I\u0002·õ\nvôê¨WÂÁÕÍå\u001a\u0001wÃ\"<0G.DAþ)%¾7\u0005Ï°=öÞ¯V.æ{$Üö6àY -á¬¶æx÷LäÀÛ\u001b\u001eT QËÐ¹\u0010}êýQn·å§öns\u0002Ä\b\u0007äé÷2±sºhµ!Ø¨É\u001ffÎ0S<HX«8CkÜûU¥^Çµ\r¼Äo¢òöðPÖ.5\u0001ÛZ¶=E5\u0011«Z´ÈÊ¬´è¸§Ð·:Å!gH¼KF\u0019m\u001eD\u0016Îq#~ý\u0004åÛßséT]I$ Ä\rèà,Ýþ\u001a2\u001d\u0002ÌøZ!:sí~KTæ$\\½Ö!Ñ\u001aÅ]!f]\fTÆ\u001d¦Fô É¬@l.½Fº´Ì£Iê;îà\rTh%¤òàá_ N6\u0015e\u0013+¥h.Fs\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014ßúóâçyJ\n¤»\u0002\u000eÃ]uö 0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014ßúóâçyJ\n¤»\u0002\u000eÃ]uö 0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u0000|\u0014¯F\u001eÆ¸Þ7±>: pmSe¹Ê\u0015-Ð])²íÝ\u0002à°pBì\"È\u0002g\\:Ì\ny7\u000e\u0006e5¸¢¸Rö®Åd\u0005G5\u0012Ãµ\u0003¦s$®¥^rÈ\b>¯fá\\Ä\b°¹¡p\u000fqU+h\u0014îí§k½ºVº]nFiSöËai¿\u0012£7ê\u0012;óÄÄà\ts)\u0018¿6¤8w[\u0015¹\bÜÓÌ­F\u0004ü\u001d\fÏsú;vý5r\b\u0011V\u0010©]µ2ïïzØ«\\Cô¡ï¤ç:lF½ôYt\u0004²üòîªÏ\u0019Ãü>ÅI<\be3ZÑ­åÖ\u000eÙÊð{¼Ñ1ë0\u0013®nó&ôZ\u0013\u0012\u0013µ¾ÚO\tÜ\rYKÎäÈCr<7`eU6*ïÌKîyËAÑø¿Ü¼x\u000f¥gx.ªRã>N÷xh±N¤`0höü×÷§U\u0013lÛ5-\u0005Øèüpa§G\\WQaÙT¿±÷\u0004àn9^h¨tú\u001e*Ô\u0001ü\\\bXÙ`\u000e+¥´$;\u0001\u0005Îs\u000b(÷CÈK×{\u000e¼¿?pó)iÃ×h\u000boÉ¨\u001fK-U\u0019Ä¥¢<dùXâ`È\u000fßlÄ\t\r`Ü\u0018£¹QîøxpF-l\u001aN{QQ½c2ZklÈË3ÚÑÄ\u0018 ±Ý`G/¹ìx´a#(ª\bFÎzj3@$LâÏÙ±ÜW~få<-\u001cfðvt\u000f|ÿUý\tÀ¥z\u0007{ØÝQR§";
                } else {
                    str = "0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/QíB¤27-jE\u0019ëi0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0 \u0017\r200309195701Z\u0018\u000f20500309195701Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000³%SªÚò|RÓ¶Z$ÄK`+Ä¹0´ß\u001d9Ç/#2WË\u0016a\bØ+q6 ä³Äaö%j%Xw>½\\2=ð{Ù#\bÞA`4zj\u0014áà©«ÛY~à£(\u0016àh£s=Ô\ff \u0007Ð{\frß«\n1Cy±ìä²\u000b|ËF4JÑiÉ\u000eQ\u001eºÓ\u000fñPEÌö\f®¹lìmTIJ\u0019mâÜ\u001eÊzpTRÀ§¦\u001dÀÍ¿\u0017ul\u001fR\u0015{\t$(ÄMñ>RÎË¦¡~^¬Må´ìñ¯j\u0007#¡@¼\u0017Bhû2¤&\u001a!òh¾%¯±7/à\u0019K\u001bg£e>*äOËSê{±§>AI<ÊëøºÕf3¨\n£k\\×ÙÄ\u0014wSÅÃ¾ÉK +IäáÙMÙ=2üé¤º?xÈ\u001e?YÈûk\u0013¤Æ©cqÅ¼M·$y\u0011eu.U^m£ê\"÷j\u001fõVöP§Ï~gãÍgD-[â.ÊòT{ñ<B_Ê¹\\qâbx\u0015\u001bè3\u001d\fÆEÑRÔÒçèMQa¼½vL\u001bjKZ÷¹#ç\u0016\u000eó¸J»EÂ\u0007©°\u0010®\u0006¡e\u0002`·ÌÐ\u0006yÿåÏ\u001e7~OýÞåµke¢bH5§7xFáco³ªÎ\u001a¯,Ú2áDôeØ¹²ºÀËeD\u0019>îI±V] \u00167Ù\"»ëäKéÄ3 ù\u001cóU\tðl\u001aR\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014Ð\u0012©²C³n\u0003\u00121¤Æ_{ºø\u0003q;0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014Ð\u0012©²C³n\u0003\u00121¤Æ_{ºø\u0003q;0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u0000«±§(\u000bE¹\u0011' ~Éë'ÃZ##YájÔÁfÝø\u001e\u0002ômÉõBÛ\"à\u0015Ó¥4ÙãÌÂ2\u0006½\u0019¥vk;Xv\u0014¿ØRÌ¯³)Û\u000e1@ô[©}6@©u\u0006®ä{ã[&Ï9ç\u0019õm×^\u000eùª{n\u0003NÜgsä%\u0010¢7k!´Þý!í\u0000MLÔX#=8OÒÍõF£<\u0018Nçs¹`éI\fÈkUôaT\u001b^ÎûC¬YN1Ô8ì¨jbvÃ{Úh{áß($~Ð­ü´!\u0003Â4ÏÚ@aÑ*£ßvÞyÖy¨Â?!{ê9F}ÿ\u0013\u001cÆ\u0010åT@a/¶7;i?½£«ð`ÊÍ\u0000#Ëíh©à8È¡\u000e¯N6YF \u0018±¹ÂH~Ú,6µ(3\u001flb\u0002¸bþ¥\u0014}ñ9·Xùóë\fFËÌø§øÈöâVíÑ­wRå¡±3¬ØUZÑaö±Ç\u0019\u0017j\rÐóm\u001dC:é\u001bÙ\u001d\u0004mó]§×ð\b·O!¤CEe§ùdù\u0000²è©¨XT\u0001\nO\u0012:E\u0004¡ \u0002\u001d9^+á\\v9\u001cu\u0016n\u0012øô¤î\u0015\"<a\u001féª¦ýÏ\u000f$\u0019Í\u0015\u0000_eUÑ²÷\u0011óY+\r0ÂLkò©â|\u0004Øt\b\u0006¶ÒõÂ\u001d\u0011F½%94V\u0014nub|­nõ\r\u001dgá^C¥!\u0011·|­w$l\u0013¦/·e¶]¦åN¡*¤£ó)ð";
                }
                bArr = A01(str);
                r2.A00 = AnonymousClass0x9.A14(bArr);
            }
        }
        return bArr;
    }

    public final int hashCode() {
        return this.A00;
    }

    public AnonymousClass6UJ(byte[] bArr) {
        if (AnonymousClass000.A1U(bArr.length, 25)) {
            this.A00 = Arrays.hashCode(bArr);
            return;
        }
        throw AnonymousClass6CA.A0N();
    }
}
