package com.typanime.typanime_backend.initializer;

import com.typanime.typanime_backend.model.Citation;
import com.typanime.typanime_backend.model.Synopsis;
import com.typanime.typanime_backend.repository.CitationRepository;
import com.typanime.typanime_backend.repository.SynopsisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CitationRepository citationRepository;
    private final SynopsisRepository synopsisRepository;

    public DataInitializer(CitationRepository citationRepository, SynopsisRepository synopsisRepository) {
        this.citationRepository = citationRepository;
        this.synopsisRepository = synopsisRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (synopsisRepository.count() == 0) {
            // La table est vide, insérer des citations
            List<Synopsis> synops = List.of(
                new Synopsis(
                    "Tensei shitara slime datta ken (moi, quand je me reincarne en slime)",
                    "Satoru, employé de bureau lambda, se fait assassiner par un criminel en pleine rue. Son histoire aurait dû s'arrêter là, mais il se retrouve soudain réincarné dans un autre monde sous la forme d'un Slime, le monstre le plus faible du bestiaire fantastique. Son nouveau corps est équipé de deux compétences uniques : « Prédateur », lui permettant de récupérer les aptitudes de ses adversaires, et « Grand sage », grâce à laquelle il acquiert une compréhension aigüe de son environnement. Mais même muni de ces armes, ses chances de survie semblent encore limitées…",
                    "assets/Synopsis/img/Tenseishitaraslimedattaken.jpg"
                ),
                new Synopsis(
                    "91 Days",
                    "L'histoire se déroule aux états-Unis, en pleine prohibition. La mafia est alors une puissante organisation à laquelle il ne vaut mieux pas se frotter. Pourtant, Avilio décide d'affronter cette organisation gigantesque dans le seul et unique but de venger sa famille assassinée. Sa cible ? Le groupe pour lequel travaillait son père autrefois...",
                    "assets/Synopsis/img/91 Days.jpg"
                ),
                new Synopsis(
                    "Angolmois Genkou Kassenki",
                    "L'histoire prend place à l'époque de Kamakura où les mongols tentent d'envahir le Japon, on suit alors l'aventure d'un samouraï prénommé Kuchii Jinzaburo essayant de protéger son pays.",
                    "assets/Synopsis/img/Angolmois Genkou Kassenki.jpg"
                ),
                new Synopsis(
                    "Ahiru No Sora",
                    "Complexé par sa petite taille, Sora est passionné de basket. Lorsqu'il entre en seconde, il décide naturellement d'intégrer l'équipe du lycée, mais découvre vite que le club est le repaire des pires voyous de l'école et qu'ils n'ont aucune intention de s'entraîner. L'enthousiasme sans limite de Sora pour le basket, déterminé à prouver que son talent dépasse son physique chétif, lui crée bientôt autant d'amis que d'ennemis...",
                    "assets/Synopsis/img/Ahiru No Sora.jpg"
                ),
                new Synopsis(
                    "Akame Ga Kill",
                    "Tatsumi, jeune combattant, se rendait à la capitale dans l'optique de sauver son village. Mais, naïf, il se fait dérober tout ce qu'il possède par une mystérieuse jeune fille et se retrouve sans un sou. Heureusement, une autre jeune fille, une noble, propose de l'accueillir chez elle pendant quelque temps. Cependant, la poisse semble coller à la peau de Tatsumi quand un groupe d'assassins débarque pour s'en prendre à sa protectrice... qui n'est pas aussi innocente qu'elle en a l'air.",
                    "assets/Synopsis/img/Akame ga kill.jpg"
                ),
                new Synopsis(
                    "All Out",
                    "L'histoire suit Kenji Gion, un lycéen de petite taille fraichement accueilli dans un lycée de la préfecture de Kanagawa. Ce dernier va rencontrer un lycéen durant un match de rugby et va petit à petit devenir ami avec lui.  Avec ce lycéen nommé Sumiaki Iwashimizu, ils vont rejoindre le club de rugby du lycée.  Cette série narre leurs exploits en tant que rugbyman.",
                    "assets/Synopsis/img/All Out.jpg"
                ),
                new Synopsis(
                    "Assassination Classroom",
                    "Au lycée Kunugigaoka se trouve la classe 3-E, exclue dans les montagnes pour étudier et surtout pour assassiner leur professeur, Koro-sensei. En effet, cette étrange créature, ressemblant à un smiley avec des tentacules, a réussi à trouer la lune jusqu'à ce que celle-ci en devienne un croissant ! Il posa alors ses conditions au gouvernement : devenir le professeur de la classe 3-E. Cependant, si d'ici une année aucun de ses élèves ne parvient à le tuer, la Terre connaîtra le même sort que celui de la Lune ! 'Si une personne y arrive, elle recevra la somme astronomique de 10 milliards de yens' ! C'est ainsi que ce groupe d'élèves va apprendre l'art de tuer de différentes manières mais aussi commencer à s'attacher à ce drôle de professeur.",
                    "assets/Synopsis/img/Assassination Classroom.jpg"
                ),
                new Synopsis(
                    "Classroom Of Elite",
                    "L'histoire prend place dans le lycée Kodo Ikusei, une école prestigieuse dotée d'installations ultramodernes où 100% des étudiants vont ensuite à l'université ou entrent dans la vie active. Les élèves ont une liberté totale, ils peuvent avoir la coupe de cheveux qu'ils désirent et apporter n'importe quel bien personnel dans l'établissement. Kodo Ikusei est comme le paradis, mais seulement en apparence, en effet seulement les étudiants avec de bons résultats reçoivent ce genre de traitement. Dans cette école, chaque mois, selon les notes et le comportement d'une classe, celle-ci se voit attribuer un nombre de points en conséquence. Ces points permettent l'achat en tout genre au sein de l'école (nourriture, jeux, consoles, ...). De plus chaque groupe est classé en fonction du nombre de points reçus. Kiyotaka Ayanokoji est un élève de la classe D, regroupant les pires élèves de l'établissement, ceux avec les résultats les plus mauvais. Pour une certaine raison, Kiyotaka a été négligent durant les examens d'entrée et a donc été placé dans cette fameuse classe. Après avoir rencontré Suzune Horikita et Kikyo Kushida, deux élèves de sa classe, Kiyotaka Ayanokoji et ses nouvelles camarades décident ensemble de coopérer afin d'améliorer les notes de leur classe et essayeront d'atteindre les classes supérieures.",
                    "assets/Synopsis/img/Classroom Of Elite.jpg"
                ),
                new Synopsis(
                    "Naruto",
                    "Dans le village de Konoha vit Naruto, un jeune garçon détesté et craint des villageois. Il est craint du fait qu'il détient en lui Kyuubi (démon renard à neuf queues) d'une incroyable force, qui a tué un grand nombre de personnes. Le ninja le plus puissant de Konoha à l'époque, le quatrième Hokage, Minato Namikaze, réussit à sceller ce démon dans le corps de Naruto. Malheureusement il y laissa la vie. C'est ainsi que douze ans plus tard, Naruto rêve de devenir le plus grand Hokage de Konoha afin que tous le reconnaissent à sa juste valeur. Mais la route pour devenir Hokage est très longue et Naruto sera confronté à un bon nombre d'épreuves et devra affronter de nombreux ennemis pour atteindre son but !",
                    "assets/Synopsis/img/Naruto.jpg"
                ),
                new Synopsis(
                    "Jujutsu Kaisen",
                    "Plus de 10 000 morts et disparus sont recensés chaque année au Japon. Les sentiments négatifs que relâchent les êtres humains sont en cause. Souffrance, regrets, humiliation : leur concentration dans un même endroit engendre des malédictions souvent mortelles... C'est ce que va découvrir Yuji Itadori, lycéen et membre du club d'occultisme. Il ne croit pas aux fantômes, mais il est doté d'une force physique hors norme qui représente un véritable atout pour les missions du groupe... jusqu'à ce que l'une d'elles prenne une mauvaise tournure. La relique qu'ils dénichent, le doigt découpé d'un démon millénaire, attire les monstres ! Sans réfléchir : le jeune homme avale la relique pour briser la malédiction ! Maintenant, il se trouve possédé par Ryômen Sukuna, le célèbre démon à deux visages. Cependant, contre toute attente, Yuji est toujours capable de garder le contrôle de son corps. Mais en dépit de cela, il est condamné à mort par l'organisation des exorcistes... Une décision qui ne pourra être repoussée qu'à une seule condition : trouver tous les doigts de Sukuna afin d'écarter la menace une bonne fois pour toutes !",
                    "assets/Synopsis/img/Jujutsu Kaisen.jpg"
                ),
                new Synopsis(
                    "DR STONE",
                    "Un jour, une lumière brillante apparaît subitement dans le ciel pétrifiant en une fraction de seconde l'humanité entière. Des millénaires plus tard, Taiju parvient à briser son enveloppe de pierre et découvre un monde où le genre humain a disparu de la surface de la terre. Avec son ami Senku, ils décident de récréer la civilisation à partir de zéro !",
                    "assets/Synopsis/img/Dr Stone.jpg"
                ),
                new Synopsis(
                    "Tokyo Revengers",
                    "À 26 ans, Takemichi a le sentiment d'avoir déjà raté sa vie. Vivotant de petits boulots ingrats tout juste bons à payer le loyer d'un studio miteux, il se lamente sur le désert de sa vie amoureuse lorsqu'il apprend la mort de Hinata, la seule petite amie qu'il ait eue... La jeune fille et son frère ont été les victimes collatérales d'un règlement de comptes entre les membres d'un gigantesque gang, le Tokyo Manji-kai.  Encore sous le choc, Takemichi est à son tour victime d'un accident qui le ramène inexplicablement 12 ans en arrière, lorsqu'il était au collège et se donnait des airs de mauvais garçon. Et si c'était pour lui l'occasion de sauver Hinata ? Mais en tentant de modifier le futur, Takemichi se retrouvera inexorablement mêlé aux complots se tramant autour du Tokyo Manji-kai et de son charismatique et mystérieux leader...",
                    "assets/Synopsis/img/Tokyo Revengers.jpg"
                ),
                new Synopsis(
                    "The Reincarnation of the Strongest Onmyouji in Another Worlds",
                    "Haruyoshi, l'exorciste le plus fort de tous, qui était sur le point de mourir à cause de la trahison de ses amis, souhaitait être heureux dans sa prochaine vie et a essayé le secret de la réincarnation. Il réussit et se réincarne dans un autre monde ! Dans cette vie, Haruyoshi est né dans une famille noble de mages, mais on juge qu'il n'a pas de pouvoirs magiques. Mais la magie qu'il voit de près n'est même pas proche de celle de son exorcisme... Peut-être n'a-t-il même pas besoin de magie pour être le plus fort, après tout ?",
                    "assets/Synopsis/img/The Reincarnation of the Strongest Onmyouji in Another World.jpg"
                ),
                new Synopsis(
                    "Eiyuu-ou, Bu wo Kiwameru tame Tensei su",
                    "Avec l'aide d'une déesse, le roi Inglis est devenu un chevalier divin et à fondé un empire. Avec le temps, il a commencé vieillir et lorsque les cieux l'ont appelé, la Déesse est apparu, lui demandant sa dernière volonté. Après avoir consacré toute sa vie à son peuple, il décide de se réincarner dans le futur pour pouvoir vivre pour lui-même.Dans un avenir lointain, le roi se réincarne donc en une jeune femme venant d'une célèbre famille de chevalier. Malheureusement, il est déclaré à l'âge de 6 ans qu'elle est incapable d'être chevalière malgré sa grande lignée.",
                    "assets/Synopsis/img/Eiyuu-ou, Bu wo Kiwameru tame Tensei.jpg"
                ),
                new Synopsis(
                    "J'épargne 80 000 pièces d'or dans un autre monde pour ma retraite",
                    "Mitsuha Yamano est une jeune fille de 18 ans qui est souvent comparée à une collégienne en raison de sa petite taille. À l'approche des épreuves d'entrée à l'université, elle perd son frère puis peu après ses parents. En raison du choc de la perte de sa famille, elle rate tous ses examens. Un jour, Mitsuha tombe d'une falaise et se retrouve dans un autre monde similaire à une Europe médiévale. Suite à un combat mortel contre des loups, elle découvre qu'il est possible de passer de ce monde au sien. Mitsuha décide de vivre en habitant dans les 2 mondes à la fois, gagner de l'argent dans le monde médiéval et vivre confortablement dans son monde moderne. Tout en gardant secrète l'existence d'un autre monde, Mitsuha va se procurer des armes afin d'explorer l'autre monde mais, en raison de sa taille, les habitants la prennent pour une petite fille.",
                    "assets/Synopsis/img/Pretde80000.jpg"
                ),
                new Synopsis(
                    "Farming life in another world",
                    "Machio Hiraku est mort d'une maladie liée au surmenage. Quand il rencontre Dieu, il a l'opportunité de se réincarner dans un autre monde et reçoit quatre souhaits en plus pour son travail acharné. Ainsi, Machio souhaite un corps qui ne puisse jamais tomber malade, vivre dans un endroit paisible, connaître la langue de l'endroit où il va se réincarner et ... être fermier ! Entouré de différentes personnes, qui vont le rejoindre au fur et à mesure, Machio est prêt à vivre sa nouvelle vie !",
                    "assets/Synopsis/img/Farming life in another world.jpg"
                ),
                new Synopsis(
                    "Chillin' in My 30s after Getting Fired from the Demon King's Army",
                    "Dariel est un soldat de 30 ans faisant partie de l'armée du Seigneur Démon. Cependant, il est incapable d'utiliser la magie ce qui provoque son renvoi de l'armée. Un jour, Dariel sauve une villageoise de l'attaque d'un monstre dans une forêt. Invité dans son village, il réalise soudainement qu'il n'est peut-être pas aussi faible qu'il ne le pensait.",
                    "assets/Synopsis/img/Chillin in My 30s after Getting Fired from the Demon Kings Army.jpg"
                ),
                new Synopsis(
                    "The Iceblade Sorcerer Shall Rule the World",
                    "Ray White est un jeune homme venant d'entrer dans la populaire académie de magie Arnold. En tant que premier élève inscrit n'étant pas d'origine noble, il est rejeté par un certain nombre de ses camarades. Néanmoins, il se lie rapidement d'amitié avec Amelia Rose, la représentante des élèves de première année et la fille ainée d'une des 3 grandes familles aristocratiques, ainsi que d'autres élèves.  Toutefois, Ray White cache un énorme secret à ses amis : il est le magicien des lames de glace et l'un des sept grands magiciens de ce monde.",
                    "assets/Synopsis/img/The Iceblade Sorcerer Shall Rule the World.jpg"
                ),
                new Synopsis(
                    "Arrête de me chauffer, Nagatoro",
                    "L'histoire nous entraîne dans le quotidien d'un lycéen timide passant ses après-midis seul dans la salle du club d'art. Un jour, il attire l'attention de Nagatoro, une lycéenne en première année au caractère très taquin. En effet, cette dernière passe ses journées à se moquer de lui et à le martyriser.  Cependant, entre l'intimidation et les taquineries, quelque chose d'autre commence à fleurir.",
                    "assets/Synopsis/img/Arrête de me chauffer Nagatoro.jpg"
                ),
                new Synopsis(
                    "Onii-chan is done for",
                    "Mahiro Oyama est un NEET hikikomori se retrouvant dans une situation des plus étrange. À son réveil, il constate que son corps n'est pas le même mais celui d'une jeune fille. Le coupable de cette transformation, sa soeur cadette, Mihari Oyama, qui a pour but de faire de son frère un homme responsable.",
                    "assets/Synopsis/img/Onii-chan is done for.jpg"
                ),
                new Synopsis(
                    "THE EMINENCE IN SHADOW",
                    "Les grands héros et les méchants diaboliques sont le genre de personnages que les gens ont envie d'être mais pas Cid Kagenou. Il aspire à devenir le véritable cerveau derrière tout cela, à tirer les ficelles et à faire en sorte que ses machinations dirigent toute l'histoire. Dans sa vie antérieure, il n'avait pas pu atteindre son objectif. Cependant, il va désormais renaître dans un monde de magie et montrer la véritable éminence de l'ombre ! Alors que Cid prétend n'être qu'une personne dans la moyenne, il recrute des membres pour sa fausse organisation nommée Shadow Garden dans le but de faire tomber le faux mystérieux culte qui se cache dans l'ombre. Grâce à de nombreuses improvisations, Cid dirige sa fausse organisation contre l'infâme, et pourtant étonnamment réel, culte de Diabolos.",
                    "assets/Synopsis/img/The eminence in shadow.jpg"
                ),
                new Synopsis(
                    "The Misfit of Demon King Academy",
                    "Après 2000 ans, le seigneur démon, ayant la capacité de détruire les humains, les élémentaires et les dieux vient d'être réincarné ! Suite à une longue période d'innombrables guerres et de conflits, Arnos, le seigneur démon, devint malade et fatigué et aspirait à un monde pacifique. Il décida donc de se réincarner. Cependant, le monde dans lequel il se réincarne est trop habitué à la paix et ses habitants sont donc trop faibles. Arnos décide de s'inscrire à l'Académie Maou, qui est un établissement créé pour rechercher tous les étudiants susceptibles de représenter la réincarnation du seigneur démon. Néanmoins, ses pouvoirs sont trop extraordinaires pour que ceux de l'académie puissent le juger correctement. Il est donc considéré comme un «étudiant inexistant». Sous-estimé et évité par la plupart des habitants de la région, il décide de recruter Misha, une des seules personnes gentille avec lui, pour grimper au sommet de la hiérarchie des démons et ainsi récupérer son titre et statut antérieurs.",
                    "assets/Synopsis/img/The Misfit of Demon King Academy.jpg"
                ),
                new Synopsis(
                    "Chainsaw Man",
                    "Pour rembourser ses dettes, Denji, jeune homme dans la dèche la plus totale, est exploité en tant que Devil Hunter avec son chien-démon-tronçonneuse, 'Pochita'. Mais suite à une cruelle trahison, il voit enfin une possibilité de se tirer des bas-fonds où il croupit ! Devenu surpuissant après sa fusion avec Pochita, Denji est recruté par une organisation et part à la chasse aux démons...",
                    "assets/Synopsis/img/Chainsaw Man.jpg"
                ),
                new Synopsis(
                    "Uzaki-Chan Wa Asobitai",
                    "L'histoire nous entraîne dans le quotidien de Sakurai Shinichi, un jeune étudiant universitaire d'un naturel calme et posé. Ce dernier ne désire qu'une chose : avoir un peu de paix et de tranquillité. Malheureusement pour lui, Uzaki Hana, une étudiante en deuxième année, va compromettre sa tranquillité en le taquinant quotidiennement.",
                    "assets/Synopsis/img/Uzaki chan wa asobitai.jpg"
                ),
                new Synopsis(
                    "Spy X Family",
                    "Sauvez le monde avec l'élite des agents (très) spéciaux : la famille Forger ! Une comédie d'espionnage pétillante ! Twilight, le plus grand espion du monde, doit pour sa nouvelle mission créer une famille de toutes pièces afin de pouvoir s'introduire dans la plus prestigieuse école de l'aristocratie. Totalement dépourvu d'expérience familiale, il va adopter une petite fille en ignorant qu'elle est télépathe, et s'associer à une jeune femme timide, sans se douter qu'elle est une redoutable tueuse à gages. Ce trio atypique va devoir composer pour passer inaperçu, tout en découvrant les vraies valeurs d'une famille unie et aimante.",
                    "assets/Synopsis/img/Spy x Family.jpg"
                ),
                new Synopsis(
                    "Nomin Kanren no Skill Bakka Agetetara Nazeka Tsuyoku Natta",
                    "Al Wayn est un jeune homme de 17 ans qui souhaite vivre une vie paisible en tant que fermier. Pour cela, il décide de monter une grande partie de ses compétences en agriculture. Quant aux autres compétences, il décide de les améliorer de temps en temps quand il aidera ses amis sur divers travaux...",
                    "assets/Synopsis/img/Nomin Kanren no Skill Bakka Agetetara Nazeka Tsuyoku Natta.jpg"
                ),
                new Synopsis(
                    "Death Note",
                    "Light Yagami, un jeune étudiant surdoué, ramasse un jour le 'Death Note', un carnet tenu auparavant par un shinigami (Dieu de la mort), Ryuk, qui apparemment s'ennuyait dans son monde. Il suffit d'écrire le nom d'une personne dans ce carnet, et celle-ci meurt (selon certaines conditions que le shinigami expliquera à Lightlors de leur rencontre). C'est ainsi qu'avec le 'Death Note' entre les mains, Light décide de débarrasser la planète de tous les criminels pour en faire un monde juste, un monde parfait.  Cependant, qui est-il pour juger les gens ? Il devient donc le pire criminel recherché de toute la planète...",
                    "assets/Synopsis/img/Death Note.jpg"
                ),
                new Synopsis(
                    "Isekai Yakkyoku",
                    "Un jeune pharmacologue et chercheur japonais est mort de surmenage et s'est réincarné dans un autre monde similaire à l'Europe médiévale. C'est ainsi qu'il se retrouve dans le corps de Falma de Médicis, un jeune apprenti de 10 ans travaillant pour un célèbre pharmacien de la Cour royale. Avec sa réincarnation, il a acquit la capacité inhumaine de pouvoir détecter les maladies, la création matérielle et la destruction matérielle. Dans une société où les pratiques médicales douteuses sont monnaie courante, le prix des médicaments fixé par la guilde des pharmaciens rendent la bonne médecine inaccessible pour les gens du peuple. Après avoir sauvé l'impératrice, Falma est autorisé à ouvrir une pharmacie dans la capitale. Il décide donc d'éliminer la fraude qui a envahi le monde et de fournir aux roturiers des médicaments vraiment efficaces, développés grâce à la pharmacologie moderne. Ainsi, le garçon pharmacien va tricher en utilisant ses connaissances antérieures pour créer des médicaments innovants tout en aidant les habitants du monde parallèle.",
                    "assets/Synopsis/img/Isekai Yakkyoku.jpg"
                ),
                new Synopsis(
                    "Love All play",
                    "L’ 'histoire se centre sur Ryo Mizushima qui a rejoint l'équipe de badminton de son collège en étant très motivé mais qui, sans entraîneur approprié, a fini dans l'obscurité. Néanmoins, il a réussi à atteindre le tournoi préfectoral grâce à sa force physique. Aujourd'hui, il rejoint la prestigieuse équipe de badminton du lycée Yokohama-Minato sous la direction du légendaire entraîneur Ebihara et entouré de coéquipiers talentueux. Il souhaite devenir un athlète de haut niveau pour ainsi amener son équipe au tournoi inter-lycées.",
                    "assets/Synopsis/img/Love All play.jpg"
                ),
                new Synopsis(
                    "Hoshi No Samidare",
                    "Alors que le monde est menacé par un gigantesque maillet spatial capable de fendre la Terre en deux, le courageux chevalier lézard Sir Noi Crezant part à la recherche du preux Yûhi Amamiya et de la princesse héroïque Samidare, qui sont les seuls capables de s'opposer à la menace. En pratique, les choses sont cependant beaucoup moins simples et Sir Noi Crezant n'est pas au bout de ses peines.",
                    "assets/Synopsis/img/Hoshi No Samidare.jpg"
                ),
                new Synopsis(
                    "Kumichou Musume To Sewagakira",
                    "L'histoire se centre sur Toru Kirishima, un homme âgé de 28 ans qui utilise sa position de yakuza pour faire tout ce qui lui chante. A cause de sa façon de faire, il a gagné le surnom de 'Démon de Sakuragi'. Pour pouvoir le maîtriser, le parrain de la mafia décide de lui confier une nouvelle mission : garder sa fille !",
                    "assets/Synopsis/img/Kumichou Musume To Sewagakira.jpg"
                ),
                new Synopsis(
                    "OVERLORD",
                    "L'histoire débute dans un jeu qui se nomme Yggdrasil, le jeu le plus populaire du moment. Cependant ce dernier décide de fermer ses serveurs à minuit. Nous suivons alors un joueur sous le pseudonyme de Momonga. Ce dernier est le chef de la guilde et décide, tout seul, d'attendre jusqu'à la fermeture du jeu. Problème, alors que minuit vient de passer, notre cher Momonga est toujours dans le jeu. C'est alors qu'il remarque rapidement que ce n'est plus le jeu auquel il passait ses journées. Les commandes du jeux n'existent plus et les PNJ sont devenus des êtres ayant des sentiments et une existence qui leur sont propres. Bien que désorienté, Momonga prend rapidement les choses en main et décide de faire de son nom une légende grâce à ses Gardiens de niveaux.",
                    "assets/Synopsis/img/Overlord.jpg"
                ),
                new Synopsis(
                    "Prison School",
                    "Le lycée Hachimitsu est réputé pour être un des plus sévères du pays. Jusqu'à cette année, il était réservé aux filles, mais les garçons y sont désormais autorisés. Seulement, comme c'est l'année-test, ils ne sont que cinq dans tout l'établissement ! Kiyoshi est l'un d'eux. Il est particulièrement timide mais cherche à discuter avec des filles. Dès le premier jour, il fait connaissance avec Chiyo car la jeune fille est amatrice de sumo, tout comme la mère de Kiyoshi. Mais à peine ont-ils lié amitié que ses quatre camarades garçons décident d'aller espionner les filles aux bains ! Kiyoshi acceptera-t-il de les accompagner, au risque de perdre la confiance de son amie ?",
                    "assets/Synopsis/img/Prison School.jpg"
                ),
                new Synopsis(
                    "Extreme Hearts",
                    "Le Hyper Sports est devenu une compétition populaire auprès des enfants et des adultes. La lycéenne Hiyori Hayama est une chanteuse qui n'a rien à voir avec le Hyper Sports. Néanmoins, elle commence à s'y intéresser suite à un incident et à une rencontre.",
                    "assets/Synopsis/img/Extreme Hearts.jpg"
                ),
                new Synopsis(
                    "Bastard !!! Heavy Metal, Dark Fantasy",
                    "400 ans après la chute de la civilisation moderne, dans un monde sans foi ni loi, où règne la magie, le fer et le sang, l'armée des ténèbres attaque le royaume de Meta-Licana dans le but de récupérer l'un des 4 sceaux emprisonnant Antrhax, le dieu de la destruction. Tout cela afin de pouvoir, grâce a lui, conquérir le monde. Pour pouvoir contrer cette attaque, les habitants de Meta-Licana décident d'utiliser leur dernier recours en libérant Dark Schneider, enfermé dans le corps d'un enfant appelé Lucié. Pour lever le sceau, il doit recevoir le baiser de la fille du grand mage Tia Noto Yoko Mais Dark Schneider n'en fait qu'à sa tête, et décide de poursuivre ce qu'il avait commencé : conquérir le monde !!",
                    "assets/Synopsis/img/Bastard !!! Heavy Metal.jpg"
                ),
                new Synopsis(
                    "Black Summoner",
                    "Après avoir remporté un tirage au sort inconnu, Kelvin se réveille dans un monde fantaisiste ressemblant à un RPG, avec tous ses souvenirs effacés. Rejoint par son guide invisible, Melfina, qui l'informe de ses nouveaux pouvoirs d'invocateur, Kelvin voyage maintenant dans ce nouveau monde pour monter en niveau, former une équipe et devenir le plus puissant invocateur !",
                    "assets/Synopsis/img/Black summoner.jpg"
                ),
                new Synopsis(
                    "Baki",
                    "Il s'agit de l'adaptation de l'arc 'Most Evil Death Row Convicts' du manga New Grappler Baki, suite de Grappler Baki de Itagaki Keisuke. Cet arc se passe quelques semaines après la finale du tournoi de l'arène souterraine. Baki plonge dans des combats clandestins où aucune règle n'existe.",
                    "assets/Synopsis/img/Baki.jpg"
                ),
                new Synopsis(
                    "Bokutachi No Remake",
                    "Le rêve de Kyôya Hashiba, un développeur de jeux vidéo âgé de 28 ans, se retrouve brisé après la faillite de son entreprise. Il décide donc de retourner chez ses parents pour se reposer. Sur place, il découvre la réussite des autres personnes de son âge et décide d'aller sur son lit en regrettant les décisions qu'il a pu faire. Cependant, lorsque ce dernier se réveille, il remarque avoir voyagé dix ans dans le passé. Ainsi, il se retrouve à devoir étudier dans l'école d'art qu'il était supposé avoir abandonné. Accompagné des créateurs qu'il admirait auparavant, Hashiba va-t-il saisir cette deuxième chance pour changer les choses ?",
                    "assets/Synopsis/img/Bokutachi No Remake.jpg"
                ),
                new Synopsis(
                    "Attaque des titans",
                    "Il y a 107 ans, les Titans ont presque exterminé la race humaine. Ces Titans mesurent principalement une dizaine de mètres et ils se nourrissent d'humains. Les humains ayant survécus à cette extermination ont construit une cité fortifiéeavec des murs d'enceinte de 50 mètres de haut pour pouvoir se protéger des Titans. Pendant 100 ans les humains ont connu la paix. Eren est un jeune garçon qui rêve de sortir de la ville pour explorer le monde extérieur. Il mène une vie paisible avec ses parents et sa soeur Mikasa dans le district de Shiganshina. Mais un jour de l'année 845, un Titan de plus de 60 mètres de haut apparaît. Il démolit une partie du mur du district de Shiganshina et provoque une invasion de Titans. Eren verra sa mère se faire dévorer sous ses yeux sans rien pouvoir faire. Il décidera après ces événements traumatisants de s'engager dans les forces militaires de la ville avec pour but d'exterminer tous les Titans qui exiattaque des titans saison",
                    "assets/Synopsis/img/Attack on titan.jpg"
                ),
                new Synopsis(
                    "Blood C",
                    "Saya Kisaragi est une jeune fille somme toute ordinaire vivant avec son père Tadayoshi, prêtre d'un temple shintoïste. Elle va au lycée, a des amis et est une incurable gloutonne, mais lorsque son devoir l'appelle, celle-ci part combattre des créatures appelées les Âgés (ou Anciens) avec l'épée sacrée qui se transmet dans sa famille. Cependant cet équilibre entre ses deux vies est petit à petit bouleversé lorsque son devoirrattrape son quotidien.",
                    "assets/Synopsis/img/Blood C.jpg"
                )
            );

            synopsisRepository.saveAll(synops);
            System.out.println("Données initiales pour les citations insérées dans la base de données.");
        } else {
            System.out.println("La base de données contient déjà des données pour les citations.");
        }

        if (citationRepository.count() == 0) {
            // La table est vide, insérer des citations
            List<Citation> citations = List.of(
                new Citation(
                    "Naruto",
                    "Uzumaki Naruto",
                    "Ne vivez pas avec des mensonges ou des peurs, car vous finirez par vous détester. Cela fait partie de la philosophie de la vie Naruto. Cela signifie que mentir et vivre avec des peurs, à la fin, vous ne vous aimez pas.",
                    "assets/citations/img/2.jpg"
                ),
                new Citation(
                    "One Piece",
                    "Roronoa Zoro",
                    "Peu m'importe que les dieux existent ou non, je suis le maître de ma vie. étape des questions religieuses, mais ne méprisez jamais quelqu'un qui y croit. Vous avez vos propres idées mais n'essayez pas d'influencer les autres et d'accepter ce que tout le monde pense différemment.",
                    "assets/citations/img/3.png"
                ),
                new Citation(
                    "Bleach",
                    "Hitsugaya Toushiro",
                    "Le ciel n'est-il pas incroyable? Peu importe le nombre de fois que vous le regardez, ce n'est jamais la même chose deux fois. Ce paradis de maintenant n'existe qu'en ce moment. Vous pouvez trouver de petits détails qui passent inaperçus et font de la vie quelque chose de merveilleux.",
                    "assets/citations/img/4.png"
                ),
                new Citation(
                    "Fullmetal Alchemist Brotherhood",
                    "Edward Elric",
                    "Levez-vous et avancez, vous avez vos jambes pour le faire. Vous devez toujours continuer",
                    "assets/citations/img/5.jpg"
                ),
                new Citation(
                    "Death Note",
                    "L.",
                    "Peu importe votre qualification, vous seul ne pouvez pas changer le monde. Mais c'est la beauté du monde. On ne peut pas tout porter, il faut savoir travailler en équipe",
                    "assets/citations/img/6.png"
                ),
                new Citation(
                    "Cowboy Bepop",
                    "Spike",
                    " Il y avait une femme, c'était la première fois que je rencontrais quelqu'un qui était vraiment en vie. Au moins, c'est ce que je pensais. Elle était… la partie de moi que j'ai perdue quelque part en cours de route, la partie qui manquait, la partie que je voulais.",
                    "assets/citations/img/7.jpg"
                ),
                new Citation(
                    "Trigun",
                    "Vash Stampede",
                    "Les gens ont des façons de penser différentes, même lorsqu'une erreur est commise ... Si la personne se rend compte de son erreur, elle peut la modifier. Si vous gardez votre vision claire, vous verrez l'avenir. la vie ... Au cours de la vie, des erreurs seront commises, l'important est d'en tirer des enseignements pour ne pas les répéter à l'avenir. Donc, vous pouvez interpréter ces mots du protagoniste de Trigun. Une des phrases d'anime les plus mémorables",
                    "assets/citations/img/8.jpg"
                ),
                new Citation(
                    "Code Geass",
                    "Lelouch Lamperouge",
                    "Si le bonheur avait une forme, elle aurait une forme de cristal, car elle peut être autour de vous sans que vous ne le remarquiez. Mais si vous changez de perspective, vous pouvez réfléchir une lumière capable de tout éclairer. Le bonheur d'être toujours en nous, mais cela dépend de la façon dont nous voyons la vie pour la ressentir ou non",
                    "assets/citations/img/9.jpg"
                ),
                new Citation(
                    "Neon Genesis Evangelion",
                    "Ryoji Kaji",
                    "Personne ne peut parfaitement comprendre une autre personne, il est déjà assez difficile de se comprendre soi-même. C'est peut-être pour cela que la vie est si intéressante. Les relations sociales ne sont pas faciles, mais elles ne devraient pas être quelque chose à haïr ou à craindre.",
                    "assets/citations/img/10.jpg"
                ),
                new Citation(
                    "Monster",
                    "Dr Tenma",
                    "Si vous n'avez pas de bons souvenirs, il n'est jamais trop tard pour commencer à les construire.",
                    "assets/citations/img/11.jpg"
                ),
                new Citation(
                    "Soul Eater",
                    "Maka",
                    "Les gens ont besoin de peur pour survivre. Nous en faisons l'expérience et nous pouvons donc devenir plus forts. Surmonter nos peurs C'est quelque chose qui nous aide émotionnellement et gagne en confiance en soi.",
                    "assets/citations/img/12.jpg"
                ),
                new Citation(
                    "Kuroshitsuji",
                    "Ciel Phantomhive",
                    "La douleur disparaît avec le temps. Mais je ne veux pas être guéri par le temps, parce que lorsque vous fuyez la douleur, avec le désir d'oublier, la seule chose que vous accomplissez est de rester coincé. Vous devenez incapable d'avancer. Même si quelque chose est douloureux, nous ne devons pas l'oublier, mais le surmonter pour vous-même et apprendre de la situation",
                    "assets/citations/img/13.jpg"
                ),
                new Citation(
                    "Tengen Toppa Gurren Lagann",
                    "Kamina",
                    "écoute bien Simon et ne l'oublie pas. Croyez en vous-même. Pas dans le moi qui croit en toi. Pas dans le toi qui croit en moi. Croyez en vous ... qui croit en vous! C'est très important croire en soi et avoir une bonne estime de soi.",
                    "assets/citations/img/14.jpg"
                ),
                new Citation(
                    "Log Horizon",
                    "Shiroe",
                    "Si vous ne pouvez pas faire quelque chose, ne le faites pas, concentrez-vous sur ce que vous pouvez faire",
                    "assets/citations/img/16.png"
                ),
                new Citation(
                    "No Game No Life",
                    "Sora",
                    "Ils disent que les gens peuvent changer, mais ... Est-ce vrai? S'ils décident qu'ils veulent voler, obtiennent-ils des ailes? Je ne le crois pas. Vous n'êtes pas obligé de changer vous-même, mais comment vous faites les choses. Vous devez créer un moyen de voler alors que vous êtes toujours le même",
                    "assets/citations/img/17.jpg"
                ),
                new Citation(
                    "Clannad",
                    "Yusuke Yoshino",
                    "Les gens se blessent continuellement, on comprend pourquoi ils doutent tant, mais ... vivre sans pouvoir faire confiance à personne ... revient à vivre sans ressentir l'amour des autres. Bien que n'étant pas un personnage principal, Yoshino dans Clannad laisse cette réflexion. Les relations sociales sont un domaine de la vie que beaucoup de gens trouvent difficile , mais cela ne signifie pas que vous devez cesser d'essayer de rencontrer des gens et de faire confiance.",
                    "assets/citations/img/15.png"
                ),
                new Citation(
                    "AIR",
                    "Michiru",
                    "Les humains ne peuvent pas vivre sans souvenirs ... Mais ils ne peuvent pas vivre uniquement de souvenirs. La vérité est que vous ne pouvez pas vivre du passé, vous devez toujours aller de l'avant.",
                    "assets/citations/img/19.jpg"
                ),
                new Citation(
                    "Ano Hana",
                    "Anaru",
                    "Plus d'un sera passé par là. En tant qu'enfant, vous voulez être plus âgé et quand vous êtes adulte, vous réalisez à quel point vous étiez libre en tant qu'enfant. C'est ainsi que Naruko Anjou commente ses amis",
                    "assets/citations/img/20.png"
                ),
                new Citation(
                    "Saint Seiya",
                    "Aiora de Leo",
                    "Aucune raison particulière n'est nécessaire pour aider quelqu'un. L'un des chevaliers d'or de Saint Seiya suggère que si vous aidez les autres, vous n'avez pas besoin de raisons pour le faire.",
                    "assets/citations/img/21.jpg"
                ),
                new Citation(
                    "Genma",
                    "Genma Saotome",
                    "Il est très facile de blesser les autres sans s'en rendre compte, surtout quand on est jeune. Le père de Ranma explique qu'il est facile de blesser les gens pour des problèmes sociaux, mais cela s'améliore avec l'âge.",
                    "assets/citations/img/22.png"
                ),
                new Citation(
                    "Kenichi",
                    "Nijima",
                    "Avoir une vision d'ensemble permet un meilleur contrôle de la situation, du moins l'intellectuel de Nijima croit en Kenichi, le disciple le plus fort",
                    "assets/citations/img/23.jpg"
                ),
                new Citation(
                    "Fairy Tail",
                    "Erza Scarlet",
                    "Ne meurs pas pour tes amis, vis pour eux. Ne soyez pas obsédé par les situations, appréciez l'amitié. C'est ainsi que vous pouvez interpréter les mots d'Erza dans Fairy Tail",
                    "assets/citations/img/24.jpg"
                ),
                new Citation(
                    "Rurouni Kenshin",
                    "Kenshi Himura",
                    "Vous pouvez mourir à tout moment, mais vivre exige du courage. Quelques paroles inspirantes du protagoniste de Rurouni Kenshin La vie est dure, mais ce n'est pas pour cette raison que vous devez être découragé.",
                    "assets/citations/img/25.jpg"
                ),
                new Citation(
                    "Elfen Lied",
                    "Lucy",
                    "Les personnes misérables ont besoin de personnes plus misérables qu'eux pour être heureuses. L'anti-héroïne de Elfen Lied parle de ce que les personnes toxiques recherchent les personnes qui sont pires pour se sentir mieux. Méfiez-vous de ce genre de personnes.",
                    "assets/citations/img/26.png"
                ),
                new Citation(
                    "Darker than Black",
                    "Hei",
                    "Si vous prétendez ressentir d'une manière ou d'une autre, à la fin, ce sentiment fera partie de vous sans que vous ne le remarquiez. Le protagoniste de Darker than Black parle de faux sentiments, comme on dit, si vous mentez à propos de quelque chose qui finit par y croire.",
                    "assets/citations/img/27.png"
                ),
                new Citation(
                    "Kurenai",
                    "Benika Juzawa",
                    "Dans la vie, de nombreuses décisions doivent être prises. Que ces décisions soient correctes ou non, personne ne le sait. C'est pourquoi les gens choisissent souvent ce qu'ils pensent être juste. Les mots du chef shinkuro dans Kurenai ne sont pas difficiles à comprendre, les décisions sont de chacun.",
                    "assets/citations/img/27.png"
                ),
                new Citation(
                    "Shaman King",
                    "Yoh Asakura",
                    "Il est facile de perdre son sang-froid, il est plus difficile de le garder. La patience est une vertu que tout le monde n'a pas, et il l'exprime le personnage principal de Shaman King",
                    "assets/citations/img/28.jpg"
                ),
                new Citation(
                    "Shingeki No Kyojin",
                    "Eren Jaeger",
                    "Depuis notre naissance ... Nous tous ... Nous sommes libres! Peu importe la force de ceux qui nous empêchent ... Combattez! Si c'est pour ça, ça ne me dérange pas de mourir! Peu importe à quel point ce monde est terrible! ... Aussi cruel soit-il! Combat! ",
                    "assets/citations/img/29.jpg"
                ),
                new Citation(
                    "Hunter x Hunter",
                    "Killua",
                    "La stupidité est beaucoup plus fascinante que l'intelligence. L'intelligence a des limites, pas la bêtise. Une opinion personnelle que vous pouvez partager ou non avec la co-vedette de Hunter x Hunter",
                    "assets/citations/img/30.png"
                ),
                new Citation(
                    "Katekyo Hitman Reborn",
                    "Sawada Tsunaoyoshi",
                    "Il y a deux sortes de personnes, celles qui sourient parce qu'elles sont heureuses et celles qui sourient pour que les autres voient qu'elles sont heureuses.",
                    "assets/citations/img/31.jpg"
                ),
                new Citation(
                    "Mirai Nikki",
                    "Marco Ikusaba",
                    "Si c'est le pire jour de votre vie, sachez que demain sera meilleur.",
                    "assets/citations/img/32.png"
                ),
                new Citation(
                    "Inuyasha",
                    "Inuyasha",
                    "Je sais que je ne peux pas t'aimer comme tu veux mais je t'aimerai de la meilleure façon que je connaisse. Il est difficile de savoir ce que les autres pensent, même en couple, mais vous pouvez donner le meilleur de vous-même, quelques mots pour vaincre le protagoniste qui a donné son nom à l'anime Inuyasha",
                    "assets/citations/img/33.jpg"
                ),
                new Citation(
                    "Yu Yu Hakusho",
                    "Shuichi",
                    "Faites confiance à vos impulsions, et même vos propres pensées ne peuvent pas vous trahir.L'un des quatre protagonistes de Yu Yu Hakusho pense que suivre son instinct est plus fiable que l'esprit.",
                    "assets/citations/img/34.jpg"
                ),
                new Citation(
                    "Digimon Adventure",
                    "TK",
                    "La vie n'est ni bonne ni mauvaise, c'est simplement magnifique.",
                    "assets/citations/img/35.jpg"
                ),
                new Citation(
                    "Gintama",
                    "Gintoki",
                    "Il est facile de perdre son sang-froid, il est plus difficile de le garder. La patience est une vertu que tout le monde n'a pas, et il l'exprime le personnage principal de Shaman King",
                    "assets/citations/img/36.jpg"
                ),
                new Citation(
                    "Tsubasa Reservoir Chronicle",
                    "Sakura",
                    "Qu'est-ce qui est fort? Je soupçonne qu'être fort n'est pas seulement une question de pouvoir, c'est aussi celui qui trouve une raison de se battre et qui y consacre corps et âme. Sakura dans Tsubasa Reservoir Chronicle estime que la force n'est pas tout physique, mais qu'il y a une part dans la motivation.",
                    "assets/citations/img/37.png"
                ),
                new Citation(
                    "Fate / Stay Night",
                    "Gilgamesh",
                    "Il y a des choses qui sont belles simplement parce que vous ne pouvez pas les avoir. Une phrase qui indique clairement qu'il veut exprimer le bonheur de l'un des serviteurs dans Fate / Stay Night",
                    "assets/citations/img/39.png"
                ),
                new Citation(
                    "Shakugan no Shana",
                    "Shana",
                    "Peu importe combien les autres m'aiment ... peu importe combien ils aiment les autres ... Si je ne le trouve pas bien, je ne le ferai pas.L'importance d'avoir ses propres critères, commentée par la protagoniste féminine de Shakugan no Shana.",
                    "assets/citations/img/40.png"
                ),
                new Citation(
                    "Deadman Wonderland",
                    "Ganta",
                    "Je veux être assez fort pour frapper le faible que je suis aujourd'hui. Une phrase d'amélioration personnelle du personnage principal de Deadman Wonderland",
                    "assets/citations/img/41.png"
                ),
                new Citation(
                    "Durarara !!",
                    "Celty",
                    "Le monde n'est pas aussi mauvais que vous le pensez. Des mots qui disent l'héroïne principale de «Durarara !!», alors qu'elle n'est précisément pas la plus normale.",
                    "assets/citations/img/42.jpg"
                ),
                new Citation(
                    "Hellsing",
                    "Alucard",
                    "L'abandon est ce qui détruit les gens. Lorsque vous refusez de tout votre coeur de vous rendre, transcendez votre humanité, avant même que la mort n'abandonne jamais.",
                    "assets/citations/img/43.jpg"
                ),
                new Citation(
                    "Ao no Exorcist",
                    "Rin Okumura",
                    "Même si vous vous écartez du droit chemin, ne déviez jamais de ce que votre coeur a décidé. Le personnage principal de Ao no Exorcist pense qu'il est important que les décisions que chacun prend soient suivies jusqu'à la fin.",
                    "assets/citations/img/44.png"
                ),
                new Citation(
                    "D. Gray-man",
                    "Leenale",
                    "Les blessures seront guéries tant que nous serons encore en vie. Ou avec le temps, une autre façon d'interpréter cette phrase de l'un des protagonistes de D. Gray-man",
                    "assets/citations/img/45.jpg"
                ),
                new Citation(
                    "Suzumiya Haruhi no Yuutsu",
                    "Suzumiya Haruhi",
                    "Les rêves commencent quand on y croit. (Suzumiya Haruhi). Le personnage principal de Suzumiya Haruhi no Yuutsu parle de souhaits",
                    "assets/citations/img/46.jpg"
                ),
                new Citation(
                    "Toradora",
                    "Minorin",
                    "IL'amour est comme croire aux OVNIS, vous ne les avez jamais vus mais vous ne perdez pas espoir de les voir. L'amour n'est pas facile, mais vous ne devez jamais abandonner . Une phrase d'encouragement de l'un des protagonistes de Toradora!",
                    "assets/citations/img/47.png"
                ),
                new Citation(
                    "Nanatsu no Taizai",
                    "Meliodas",
                    "L'important n'est pas ce que les autres pensent de vous, mais ce que vous ressentez pour eux. Une phrase que nous pouvons trouver dans l'anime Nanatsu no Taizai, à propos de l'opinion sociale.",
                    "assets/citations/img/48.jpg"
                ),
                new Citation(
                    "Princesse Momonoke",
                    "San",
                    "Les arbres hurlent de douleur quand ils meurent, mais vous ne pouvez pas les entendre. (San). Rappelez-vous que les plantes sont des êtres vivants, une phrase remarquable de la Princesse Mononoke.",
                    "assets/citations/img/49.jpg"
                ),
                new Citation(
                    "La fille qui a sauté dans le temps",
                    "Tableau Noir",
                    "Le temps n'attend personne. Bien que personne ne le dise, cette phrase inspirante peut être lu écrit sur le tableau de classe dans le film d'animation Toki wo kakeru shojo , traduit par La fille qui a sauté dans le temps",
                    "assets/citations/img/50.jpg"
                ),
                new Citation(
                    "Empty",
                    "Taki Tachibani",
                    "Les chaînes représentent le flux lui-même. Les cordes se tordent, vacillent, se défont, se reconnectent. C'est l'heure.",
                    "assets/citations/img/51.png"
                )
            );

            citationRepository.saveAll(citations);
            System.out.println("Données initiales pour les citations insérées dans la base de données.");
        } else {
            System.out.println("La base de données contient déjà des données pour les citations.");
        }
    }
}
