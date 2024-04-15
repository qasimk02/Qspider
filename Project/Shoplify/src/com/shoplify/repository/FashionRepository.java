package com.shoplify.repository;

import java.util.ArrayList;
import java.util.List;

import com.shoplify.model.FashionProduct;
import com.shoplify.model.Product;
import com.shoplify.util.AppConstants;

public class FashionRepository implements ProductRepository{

	private static List<FashionProduct> fashionProducts;

	
    public static void init() {
        fashionProducts = new ArrayList<>();

        // mens products
        // shirts
        fashionProducts.add(new FashionProduct(
                "Classic Formal Shirt",
                "Gentleman's Attire",
                800,
                1599.99,
                15,
                "Elevate your formal look with this classic shirt from Gentleman's Attire. Crafted from high-quality cotton, this shirt offers a sleek and sophisticated appearance suitable for any formal occasion. Its timeless design features a pointed collar, button-up front, and long sleeves with button cuffs. Whether you're attending a business meeting or a formal dinner, this shirt ensures both comfort and style. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("white", "blue", "red"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.shirtCategory));

        fashionProducts.add(new FashionProduct(
                "Striped Formal Shirt",
                "Elite Menswear",
                900,
                1799.99,
                12,
                "Make a statement in the boardroom with this sophisticated shirt from Elite Menswear. Crafted from premium cotton fabric, it features a subtle striped pattern that adds depth to your ensemble. The classic design includes a spread collar, buttoned cuffs, and a tailored fit for a polished appearance. Whether paired with a suit or worn under a blazer, this shirt exudes professionalism and confidence. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("blue", "gray", "green"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.shirtCategory));

        fashionProducts.add(new FashionProduct(
                "Checked Formal Shirt",
                "Urbane Elegance",
                750,
                1499.99,
                20,
                "Add a touch of sophistication to your wardrobe with this checked shirt from Urbane Elegance. Made from high-quality cotton, it offers a comfortable and breathable feel throughout the day. The timeless checked pattern in shades of grey adds a contemporary twist to your formal attire. Designed with a classic collar, button-up front, and long sleeves, this shirt is versatile for both office and evening wear. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("grey", "red", "yellow", "white"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.shirtCategory));

        fashionProducts.add(new FashionProduct(
                "Slim Fit Formal Shirt",
                "Dapper Trends",
                850,
                1699.99,
                18,
                "Step up your formal game with this sleek shirt from Dapper Trends. Tailored to perfection, it features a slim fit design that accentuates your silhouette with a modern edge. Crafted from high-quality cotton, it ensures all-day comfort and breathability. The minimalist design is complemented by a spread collar, buttoned cuffs, and a button-up front. Whether worn with a suit or paired with chinos, this shirt exudes confidence and sophistication. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("black", "white"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.shirtCategory));

        fashionProducts.add(new FashionProduct(
                "French Cuff Formal Shirt",
                "Royal Elegance",
                950,
                1899.99,
                14,
                "Make a statement of elegance with this French cuff shirt from Royal Elegance. Crafted from luxurious cotton, it boasts a crisp and refined look suitable for any formal occasion. The standout feature of this shirt is its French cuffs, adding a touch of sophistication to your ensemble. Pair it with your favorite cufflinks for a personalized touch. With its classic spread collar and tailored fit, this shirt is a timeless addition to your wardrobe. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l"),
                List.of("white", "blue"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.shirtCategory));

        // pants
        fashionProducts.add(new FashionProduct(
                "Classic Formal Pants",
                "DressCode",
                1200,
                2399.99,
                20,
                "Achieve a polished look with these classic formal pants from DressCode. Crafted from high-quality polyester blend fabric, these pants offer a comfortable fit with a sleek finish. The timeless design features a flat front, straight-leg silhouette, and belt loops for added convenience. Whether paired with a dress shirt or a blazer, these pants ensure effortless style for any formal occasion. Available in waist sizes 28 to 36.",
                true,
                "Polyester Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("black", "blue"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        fashionProducts.add(new FashionProduct(
                "Slim Fit Formal Pants",
                "Elegant Wear",
                1100,
                2199.99,
                15,
                "Update your formal wardrobe with these slim fit formal pants from Elegant Wear. Made from premium wool blend fabric, these pants offer a flattering silhouette with a modern edge. The slim fit design features a flat front, tapered legs, and a concealed hook-and-eye closure for a streamlined look. Perfect for both office meetings and evening events, these pants combine style and comfort effortlessly. Available in waist sizes 28 to 36.",
                true,
                "Wool Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("blue", "white", "grey"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        fashionProducts.add(new FashionProduct(
                "Charcoal Grey Dress Pants",
                "Executive Style",
                1250,
                2499.99,
                18,
                "Elevate your formal attire with these charcoal dress pants from Executive Style. Crafted from a luxurious wool blend fabric, these pants offer a sophisticated look with exceptional comfort. The versatile design features a flat front, straight-leg silhouette, and welt pockets for added functionality. Whether paired with a blazer or a sweater, these pants ensure a refined appearance for any occasion. Available in waist sizes 28 to 36.",
                true,
                "Wool Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("grey"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        fashionProducts.add(new FashionProduct(
                "Light Grey Pleated Formal Pants",
                "Modern Gentleman",
                1050,
                2099.99,
                25,
                "Add a touch of sophistication to your ensemble with these light pleated formal pants from Modern Gentleman. Made from a premium polyester blend fabric, these pants offer a refined look with optimal comfort. The pleated front adds subtle texture and depth to the design, while the straight-leg silhouette ensures a timeless appeal. Perfect for formal occasions or office wear, these pants deliver both style and versatility. Available in waist sizes 28 to 36.",
                true,
                "Polyester Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("grey", "black"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        fashionProducts.add(new FashionProduct(
                "Dark Brown Tailored Dress Pants",
                "Sophisticated Threads",
                1150,
                2299.99,
                22,
                "Make a statement of elegance with these dark brown tailored dress pants from Sophisticated Threads. Crafted from a premium wool blend fabric, these pants offer a luxurious feel with impeccable craftsmanship. The tailored fit design features a flat front, straight-leg silhouette, and side pockets for added convenience. Whether paired with a dress shirt or a sweater, these pants exude sophistication and refinement. Available in waist sizes 28 to 36.",
                true,
                "Wool Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("brown"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        fashionProducts.add(new FashionProduct(
                "Slim Straight Formal Pants",
                "Urban Elegance",
                1180,
                2359.99,
                17,
                "Upgrade your formal wardrobe with these taupe slim straight formal pants from Urban Elegance. Made from a high-quality polyester blend fabric, these pants offer a sleek and modern look with exceptional comfort. The slim straight fit design features a flat front, tapered legs, and belt loops for added convenience. Whether worn with a dress shirt or a blazer, these pants ensure a sophisticated appearance for any occasion. Available in waist sizes 28 to 36.",
                true,
                "Polyester Blend",
                List.of("28", "30", "32", "34", "36"),
                List.of("blue", "grey", "white"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.pantCategory));

        // suits
        fashionProducts.add(new FashionProduct(
                "Classic Two-Piece Suit",
                "Elegant Attire",
                3500,
                6999.99,
                15,
                "Make a timeless statement with this classic two-piece suit from Elegant Attire. Crafted from high-quality wool blend fabric, this suit exudes sophistication and style. The single-breasted jacket features notch lapels, a two-button closure, and welt pockets for a sleek look. The matching flat-front trousers complete the ensemble with a tailored fit and versatility. Perfect for formal occasions or business meetings, this suit ensures confidence and elegance.",
                true,
                "Wool Blend",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("black", "navy blue", "charcoal grey"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Slim Fit Suit",
                "Modern Trends",
                3200,
                6399.99,
                12,
                "Step into sophistication with this slim fit suit from Modern Trends. Tailored to perfection, this two-piece suit is crafted from premium wool blend fabric for exceptional comfort and style. The slim-fit jacket features narrow lapels, a two-button closure, and flap pockets for a contemporary look. Paired with flat-front trousers, this suit offers a modern silhouette suitable for any formal occasion.",
                true,
                "Wool Blend",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("navy blue", "charcoal grey", "light grey"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Three-Piece Suit",
                "Executive Style",
                3800,
                7599.99,
                18,
                "Elevate your formal attire with this three-piece suit from Executive Style. Made from luxurious wool blend fabric, this suit offers impeccable tailoring and sophistication. The single-breasted jacket features peak lapels, a two-button closure, and welt pockets for a distinguished look. Accompanied by a matching vest and flat-front trousers, this suit exudes elegance and refinement for any special occasion.",
                true,
                "Wool Blend",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("charcoal grey", "light grey", "dark brown"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Tailored Suit",
                "Sophisticated Threads",
                3400,
                6799.99,
                20,
                "Add a touch of sophistication to your wardrobe with this tailored suit from Sophisticated Threads. Crafted from premium wool blend fabric, this two-piece suit offers a refined look with exceptional comfort. The single-breasted jacket features slim notch lapels, a two-button closure, and welt pockets for a modern aesthetic. Paired with flat-front trousers, this suit delivers timeless elegance for formal events or professional settings.",
                true,
                "Wool Blend",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("light grey", "dark brown", "taupe"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Tweed Suit",
                "Vintage Charm",
                3600,
                7199.99,
                14,
                "Embrace vintage elegance with this tweed suit from Vintage Charm. Crafted from premium tweed fabric, this two-piece suit offers a distinctive look with timeless appeal. The single-breasted jacket features notch lapels, a two-button closure, and flap pockets for a classic aesthetic. Paired with matching flat-front trousers, this suit exudes sophistication and character for formal occasions or retro-themed events.",
                true,
                "Tweed",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("dark brown", "charcoal grey", "navy blue"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Pinstripe Suit",
                "Gentleman's Choice",
                3300,
                6599.99,
                16,
                "Make a statement of refinement with this pinstripe suit from Gentleman's Choice. Crafted from premium wool blend fabric, this two-piece suit offers a classic yet sophisticated look. The single-breasted jacket features pinstripe detailing, notch lapels, a two-button closure, and flap pockets for a distinguished appearance. Paired with flat-front trousers, this suit ensures impeccable style for any formal occasion.",
                true,
                "Wool Blend",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("navy blue", "black", "charcoal grey"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        fashionProducts.add(new FashionProduct(
                "Velvet Dinner Suit",
                "Royal Elegance",
                3900,
                7799.99,
                10,
                "Exude luxury and sophistication with this velvet dinner suit from Royal Elegance. Crafted from plush velvet fabric, this two-piece suit offers opulent style with a contemporary twist. The single-breasted jacket features satin peak lapels, a single-button closure, and jetted pockets for a refined look. Paired with flat-front trousers, this suit is perfect for formal dinners, gala events, or red-carpet occasions.",
                true,
                "Velvet",
                List.of("35s", "38s", "40s", "42s", "35r", "38r", "40r", "42r", "35l", "38l", "40l", "42l"),
                List.of("black"),
                AppConstants.formalStyle,
                AppConstants.mensSection,
                AppConstants.suitsCategory));

        // tshirts
        fashionProducts.add(new FashionProduct(
                "Graphic Print T-Shirt",
                "Urban Trends",
                499,
                799.99,
                20,
                "Add a touch of urban flair to your casual wardrobe with this graphic print t-shirt. Made from soft cotton fabric, it features a bold graphic print on the front. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("black", "white", "grey", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "Pocket Detail Tee",
                "Street Style Co.",
                599,
                999.99,
                15,
                "Elevate your everyday style with this pocket detail tee. Crafted from breathable cotton blend fabric, it features a chest pocket detail for added interest. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("charcoal grey", "olive green", "burgundy", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "Striped Crew Neck T-Shirt",
                "Casual Classics",
                549,
                899.99,
                18,
                "Keep it classic and comfortable with this striped crew neck t-shirt. Made from lightweight cotton fabric, it features a timeless striped pattern and a relaxed fit. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("black/white", "navy blue/white", "grey/white", "red/white"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "V-Neck Basic Tee",
                "Everyday Basics",
                479,
                749.99,
                25,
                "Update your basics collection with this v-neck basic tee. Constructed from soft and stretchy cotton blend fabric, it offers a comfortable fit and easy layering. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("white", "black", "grey", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.tshirtCategory));

        // jeans
        fashionProducts.add(new FashionProduct(
                "Classic Blue Denim Jeans",
                "Denim Deluxe",
                1299,
                1999.99,
                30,
                "Embrace classic style with these blue denim jeans. Crafted from durable denim fabric, they feature a regular fit and five-pocket styling. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Denim",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Slim Fit Ripped Jeans",
                "Urban Edge",
                1499,
                2299.99,
                25,
                "Make a statement with these slim fit ripped jeans. Constructed from stretch denim, they offer a modern slim fit silhouette with distressed detailing. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Denim",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("light blue", "black"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Vintage Washed Denim Jeans",
                "Retro Style",
                1399,
                2099.99,
                20,
                "Channel retro vibes with these vintage washed denim jeans. Featuring a relaxed fit and faded wash, they offer a laid-back yet stylish look. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Denim",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("light blue", "medium blue", "dark blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Straight Leg Black Jeans",
                "Street Chic",
                1399,
                2199.99,
                22,
                "Elevate your casual attire with these straight leg black jeans. Made from premium denim, they boast a straight leg silhouette and versatile styling options. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Denim",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("black"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.jeansCategory));

        // chinos
        fashionProducts.add(new FashionProduct(
                "Slim Fit Khaki Chinos",
                "Urban Essentials",
                1199,
                1799.99,
                28,
                "Update your casual wardrobe with these slim fit khaki chinos. Crafted from comfortable cotton twill fabric, they feature a slim leg silhouette and classic chino styling. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Cotton Twill",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("khaki"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.chinosCategory));

        fashionProducts.add(new FashionProduct(
                "Straight Leg Beige Chinos",
                "Casual Classics",
                1099,
                1699.99,
                26,
                "Achieve a timeless look with these straight leg beige chinos. Made from soft and lightweight cotton fabric, they offer a relaxed fit and versatile styling options. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Cotton",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("beige"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.chinosCategory));

        fashionProducts.add(new FashionProduct(
                "Stretch Slim Fit Chinos",
                "Modern Comfort",
                1299,
                1999.99,
                24,
                "Stay comfortable all day long in these stretch slim fit chinos. Constructed from stretch cotton fabric, they provide flexibility and ease of movement. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Stretch Cotton",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("charcoal grey", "olive green"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.chinosCategory));

        fashionProducts.add(new FashionProduct(
                "Tapered Fit Olive Chinos",
                "Urban Casuals",
                1249,
                1899.99,
                22,
                "Add a touch of modernity to your wardrobe with these tapered fit olive chinos. Featuring a tapered leg silhouette and garment-dyed finish, they offer a contemporary yet casual appeal. Available in sizes 28S, 30S, 32S, 34S, and 36S.",
                true,
                "Cotton",
                List.of("28s", "30s", "32s", "34s", "36s"),
                List.of("olive green"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.chinosCategory));

        // sweaters
        fashionProducts.add(new FashionProduct(
                "Crew Neck Cable Knit Sweater",
                "Cozy Classics",
                1899,
                2799.99,
                20,
                "Stay warm and stylish with this crew neck cable knit sweater. Crafted from soft acrylic blend fabric, it features a classic cable knit design and ribbed trims. Available in sizes S, M, L, and XL.",
                true,
                "Acrylic Blend",
                List.of("s", "m", "l", "xl"),
                List.of("grey", "navy blue", "burgundy"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.sweaterCategory));

        fashionProducts.add(new FashionProduct(
                "V-Neck Pullover Sweater",
                "Casual Comfort",
                1799,
                2599.99,
                18,
                "Elevate your casual look with this v-neck pullover sweater. Made from lightweight cotton blend fabric, it offers a relaxed fit and easy layering. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("black", "charcoal grey", "olive green"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.sweaterCategory));

        fashionProducts.add(new FashionProduct(
                "Striped Quarter-Zip Sweater",
                "Urban Trends",
                1699,
                2399.99,
                22,
                "Stay cozy and stylish with this striped quarter-zip sweater. Constructed from soft and warm fabric, it features a classic striped pattern and a quarter-zip neckline. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("navy blue/white", "grey/black", "burgundy/charcoal grey"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.sweaterCategory));

        fashionProducts.add(new FashionProduct(
                "Knit Turtleneck Sweater",
                "Modern Style",
                1999,
                2899.99,
                15,
                "Embrace sophistication with this knit turtleneck sweater. Crafted from premium wool blend fabric, it features a classic turtleneck design and ribbed trims. Available in sizes S, M, L, and XL.",
                true,
                "Wool Blend",
                List.of("s", "m", "l", "xl"),
                List.of("black", "charcoal grey", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.sweaterCategory));

        // shoes
        fashionProducts.add(new FashionProduct(
                "Canvas Sneakers",
                "Urban Footwear",
                799,
                1299.99,
                35,
                "Step out in style with these classic canvas sneakers from Urban Footwear. Featuring a timeless lace-up design and durable rubber sole, these sneakers offer both comfort and versatility. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Canvas",
                List.of("7", "8", "9", "10", "11"),
                List.of("black", "white", "navy blue", "grey"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Casual Loafers",
                "Comfort Style",
                1199,
                1799.99,
                25,
                "Upgrade your casual footwear collection with these stylish casual loafers from Comfort Style. Crafted from faux leather with a slip-on design, they offer both comfort and convenience. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Faux Leather",
                List.of("7", "8", "9", "10", "11"),
                List.of("brown", "black", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Athletic Sneakers",
                "Active Gear",
                999,
                1499.99,
                30,
                "Stay active and comfortable with these athletic sneakers from Active Gear. Designed for maximum performance, they feature a breathable mesh upper and cushioned insole for superior comfort. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Mesh",
                List.of("7", "8", "9", "10", "11"),
                List.of("black/red", "blue/white", "grey/black", "navy blue/yellow"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Slip-On Espadrilles",
                "Coastal Style",
                899,
                1399.99,
                20,
                "Get ready for summer with these comfortable slip-on espadrilles from Coastal Style. Made from lightweight canvas with a jute-wrapped sole, they're perfect for beach days or casual outings. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Canvas",
                List.of("7", "8", "9", "10", "11"),
                List.of("beige", "navy blue", "striped", "black"),
                AppConstants.casualStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        // shorts
        fashionProducts.add(new FashionProduct(
                "Performance Training Shorts",
                "Active Gear",
                699,
                1199.99,
                40,
                "Maximize your workout with these performance training shorts from Active Gear. Made from moisture-wicking fabric with stretch technology, they provide comfort and flexibility during intense exercise sessions. Available in sizes S, M, L, and XL.",
                true,
                "Polyester Blend",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "grey", "charcoal"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shortsCategory));

        fashionProducts.add(new FashionProduct(
                "Running Shorts with Liner",
                "Speedy Stride",
                799,
                1299.99,
                35,
                "Stay comfortable and focused on your run with these running shorts from Speedy Stride. Featuring a built-in liner for support and breathability, they're perfect for long-distance running. Available in sizes S, M, L, and XL.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("blue", "black", "red", "grey"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shortsCategory));

        fashionProducts.add(new FashionProduct(
                "Basketball Shorts",
                "Court King",
                899,
                1499.99,
                30,
                "Dominate the court in these basketball shorts from Court King. Made from breathable mesh fabric with an elastic waistband, they offer comfort and mobility during intense games. Available in sizes S, M, L, and XL.",
                true,
                "Mesh",
                List.of("s", "m", "l", "xl"),
                List.of("black/white", "navy blue/red", "grey/black", "blue/yellow"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shortsCategory));

        // hoodies
        fashionProducts.add(new FashionProduct(
                "Performance Zip-Up Hoodie",
                "Active Comfort",
                1299,
                1999.99,
                25,
                "Stay warm and comfortable during workouts with this performance zip-up hoodie from Active Comfort. Made from moisture-wicking fabric with stretch properties, it offers flexibility and breathability. Available in sizes S, M, L, and XL.",
                true,
                "Polyester Blend",
                List.of("s", "m", "l", "xl"),
                List.of("black", "charcoal grey", "navy blue", "olive green"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Fleece Pullover Hoodie",
                "Cozy Essentials",
                1199,
                1799.99,
                30,
                "Stay cozy on chilly days with this fleece pullover hoodie from Cozy Essentials. Made from soft fleece fabric, it features a kangaroo pocket and adjustable drawstring hood. Available in sizes S, M, L, and XL.",
                true,
                "Fleece",
                List.of("s", "m", "l", "xl"),
                List.of("heather grey", "navy blue", "black", "charcoal"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Tech Fleece Hoodie",
                "TechFit",
                1399,
                2199.99,
                20,
                "Experience ultimate comfort and warmth with this tech fleece hoodie from TechFit. Constructed from innovative tech fleece fabric, it offers superior insulation and moisture management. Available in sizes S, M, L, and XL.",
                true,
                "Tech Fleece",
                List.of("s", "m", "l", "xl"),
                List.of("black", "charcoal grey", "navy blue", "olive green"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        // shoes
        fashionProducts.add(new FashionProduct(
                "Running Sneakers",
                "SpeedRunner",
                1499,
                2399.99,
                35,
                "Enhance your running experience with these lightweight running sneakers from SpeedRunner. Designed for speed and performance, they feature a breathable mesh upper and responsive cushioning. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Mesh",
                List.of("7", "8", "9", "10", "11"),
                List.of("black/white", "blue/orange", "grey/yellow", "navy blue/green"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Cross-Training Shoes",
                "PowerFit",
                1599,
                2599.99,
                30,
                "Take your training to the next level with these cross-training shoes from PowerFit. Built for versatility and support, they feature a durable outsole and cushioned midsole for comfort. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Synthetic",
                List.of("7", "8", "9", "10", "11"),
                List.of("black/grey", "blue/red", "navy blue/yellow", "grey/orange"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Trail Running Shoes",
                "Outdoor Explorer",
                1699,
                2699.99,
                25,
                "Conquer any terrain with these trail running shoes from Outdoor Explorer. Featuring a rugged outsole and protective toe cap, they offer stability and traction on rough trails. Available in sizes 7, 8, 9, 10, and 11.",
                true,
                "Mesh/Synthetic",
                List.of("7", "8", "9", "10", "11"),
                List.of("black/grey", "blue/green", "charcoal/red", "navy blue/orange"),
                AppConstants.activeWearStyle,
                AppConstants.mensSection,
                AppConstants.shoesCategory));

        // coats
        fashionProducts.add(new FashionProduct(
                "Wool Blend Overcoat",
                "Classic Elegance",
                3499,
                5999.99,
                10,
                "Elevate your winter wardrobe with this wool blend overcoat from Classic Elegance. Crafted from premium wool blend fabric, this coat offers warmth and sophistication. Featuring a tailored fit and timeless design, it's perfect for formal occasions or everyday wear. Available in sizes S, M, L, and XL.",
                true,
                "Wool Blend",
                List.of("s", "m", "l", "xl"),
                List.of("charcoal grey", "navy blue", "camel", "black"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Quilted Parka Coat",
                "Winter Explorer",
                2999,
                4999.99,
                15,
                "Stay warm and stylish in cold weather with this quilted parka coat from Winter Explorer. Designed for outdoor adventures, it features a quilted design, faux fur trim hood, and multiple pockets for added functionality. Available in sizes S, M, L, and XL.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("olive green", "navy blue", "black", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Double-Breasted Peacoat",
                "Heritage Style",
                3199,
                5499.99,
                12,
                "Channel timeless sophistication with this double-breasted peacoat from Heritage Style. Made from durable wool blend fabric, it features a classic double-breasted front and notch lapels for a refined look. Available in sizes S, M, L, and XL.",
                true,
                "Wool Blend",
                List.of("s", "m", "l", "xl"),
                List.of("navy blue", "charcoal grey", "black", "camel"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Longline Trench Coat",
                "City Chic",
                3699,
                6299.99,
                8,
                "Make a statement with this longline trench coat from City Chic. Crafted from water-resistant fabric, it features a classic trench silhouette with a belted waist and storm flap detail. Perfect for rainy days or chilly evenings. Available in sizes S, M, L, and XL.",
                true,
                "Polyester Blend",
                List.of("s", "m", "l", "xl"),
                List.of("khaki", "black", "navy blue", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Down Puffer Jacket",
                "Winter Ready",
                2799,
                4599.99,
                20,
                "Stay cozy in cold conditions with this down puffer jacket from Winter Ready. Filled with premium down insulation, it provides exceptional warmth without the bulk. Featuring a water-resistant shell and adjustable hood for added protection. Available in sizes S, M, L, and XL.",
                true,
                "Nylon",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "olive green", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.coatsCategory));

        // jackets
        fashionProducts.add(new FashionProduct(
                "Bomber Jacket",
                "Street Style",
                1999,
                3299.99,
                25,
                "Add urban edge to your look with this bomber jacket from Street Style. Made from durable nylon fabric with a quilted lining, it offers warmth and style. Featuring ribbed cuffs and hem for a classic bomber silhouette. Available in sizes S, M, L, and XL.",
                true,
                "Nylon",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "olive green", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Denim Trucker Jacket",
                "Vintage Vibes",
                2299,
                3799.99,
                18,
                "Channel retro cool with this denim trucker jacket from Vintage Vibes. Crafted from sturdy denim with a faded wash, it features classic trucker jacket details like chest pockets and metal buttons. Available in sizes S, M, L, and XL.",
                true,
                "Denim",
                List.of("s", "m", "l", "xl"),
                List.of("blue", "black", "light blue", "grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Leather Biker Jacket",
                "Rebel Rider",
                2799,
                4599.99,
                15,
                "Rev up your style with this leather biker jacket from Rebel Rider. Crafted from supple leather with quilted panels and metal hardware, it exudes rugged appeal. Perfect for adding attitude to any outfit. Available in sizes S, M, L, and XL.",
                true,
                "Leather",
                List.of("s", "m", "l", "xl"),
                List.of("black", "brown", "dark brown"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Utility Field Jacket",
                "Adventure Seeker",
                2499,
                4099.99,
                20,
                "Explore the great outdoors in style with this utility field jacket from Adventure Seeker. Made from durable cotton canvas with multiple pockets for storage, it's designed for outdoor adventures. Available in sizes S, M, L, and XL.",
                true,
                "Cotton",
                List.of("s", "m", "l", "xl"),
                List.of("khaki", "olive green", "navy blue", "black"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Waterproof Rain Jacket",
                "Rain Ready",
                1999,
                3299.99,
                22,
                "Stay dry and comfortable in wet weather with this waterproof rain jacket from Rain Ready. Constructed from breathable fabric with sealed seams, it offers protection from the elements. Featuring an adjustable hood and zippered pockets. Available in sizes S, M, L, and XL.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "olive green", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.jacketCategory));

        // hoodies
        fashionProducts.add(new FashionProduct(
                "Fleece Zip-Up Hoodie",
                "Cozy Comfort",
                1399,
                2299.99,
                30,
                "Stay warm and comfortable with this fleece zip-up hoodie from Cozy Comfort. Made from soft fleece fabric with a full-zip front and kangaroo pocket, it's perfect for casual wear. Available in sizes S, M, L, and XL.",
                true,
                "Fleece",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "charcoal grey", "heather grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Sherpa-Lined Hoodie",
                "Winter Warmth",
                1599,
                2599.99,
                25,
                "Beat the cold in style with this sherpa-lined hoodie from Winter Warmth. Featuring a cozy sherpa lining and drawstring hood, it's perfect for layering in chilly weather. Available in sizes S, M, L, and XL.",
                true,
                "Cotton/Polyester Blend",
                List.of("s", "m", "l", "xl"),
                List.of("navy blue", "black", "charcoal grey", "olive green"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Graphic Print Hoodie",
                "Street Style",
                1299,
                2099.99,
                20,
                "Make a statement with this graphic print hoodie from Street Style. Featuring bold graphic prints and a relaxed fit, it adds urban edge to any outfit. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("black", "white", "grey", "navy blue"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Pullover Hoodie with Logo",
                "Sporty Style",
                1499,
                2399.99,
                18,
                "Show off your sporty side with this pullover hoodie featuring a bold logo print. Made from soft cotton blend fabric with a kangaroo pocket and drawstring hood, it's perfect for everyday wear. Available in sizes S, M, L, and XL.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("navy blue", "black", "grey", "charcoal grey"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        fashionProducts.add(new FashionProduct(
                "Quarter-Zip Fleece Hoodie",
                "Outdoor Explorer",
                1199,
                1999.99,
                22,
                "Stay cozy on outdoor adventures with this quarter-zip fleece hoodie from Outdoor Explorer. Made from soft fleece fabric with a quarter-zip design and zippered chest pocket, it combines warmth and functionality. Available in sizes S, M, L, and XL.",
                true,
                "Fleece",
                List.of("s", "m", "l", "xl"),
                List.of("black", "navy blue", "charcoal grey", "olive green"),
                AppConstants.outWearStyle,
                AppConstants.mensSection,
                AppConstants.hoodiesCategory));

        // womens

        // tshirts
        fashionProducts.add(new FashionProduct(
                "Basic Crewneck T-Shirt",
                "Everyday Essentials",
                299,
                499.99,
                50,
                "Stay comfortable and stylish with this basic crewneck t-shirt from Everyday Essentials. Made from soft cotton fabric, it features a classic fit and versatile design. Perfect for layering or wearing on its own. Available in sizes XS, S, M, and L.",
                true,
                "Cotton",
                List.of("xs", "s", "m", "l"),
                List.of("white", "black", "grey", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "V-Neck Pocket Tee",
                "Casual Chic",
                349,
                599.99,
                45,
                "Add a touch of casual chic to your wardrobe with this V-neck pocket tee from Casual Chic. Featuring a flattering V-neckline and front pocket detail, it's both comfortable and stylish. Available in sizes XS, S, M, and L.",
                true,
                "Cotton Blend",
                List.of("xs", "s", "m", "l"),
                List.of("white", "black", "heather grey", "olive green"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "Striped Boatneck Top",
                "Nautical Vibes",
                399,
                699.99,
                40,
                "Sail away in style with this striped boatneck top from Nautical Vibes. Made from soft jersey fabric, it features a classic boat neckline and chic striped pattern. Perfect for weekends or casual outings. Available in sizes XS, S, M, and L.",
                true,
                "Jersey",
                List.of("xs", "s", "m", "l"),
                List.of("navy blue/white", "black/white", "red/white", "blue/white"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "Graphic Print Tee",
                "Urban Style",
                449,
                799.99,
                35,
                "Make a statement with this graphic print tee from Urban Style. Featuring bold graphics and a relaxed fit, it adds urban edge to any outfit. Available in sizes XS, S, M, and L.",
                true,
                "Cotton",
                List.of("xs", "s", "m", "l"),
                List.of("black", "white", "grey", "pink"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.tshirtCategory));

        fashionProducts.add(new FashionProduct(
                "Linen Blend T-Shirt",
                "Summer Breeze",
                379,
                649.99,
                30,
                "Stay cool and comfortable in hot weather with this linen blend t-shirt from Summer Breeze. Made from lightweight fabric, it features a relaxed fit and breathable linen blend. Available in sizes XS, S, M, and L.",
                true,
                "Linen Blend",
                List.of("xs", "s", "m", "l"),
                List.of("white", "black", "blue", "pink"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.tshirtCategory));

        // jeans
        fashionProducts.add(new FashionProduct(
                "Skinny Jeans",
                "Curve Embrace",
                999,
                1699.99,
                20,
                "Flatter your figure with these curve-embracing skinny jeans from Curve Embrace. Made from stretch denim fabric, they offer a comfortable and slimming fit. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "black", "light wash", "medium wash"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "High-Waisted Mom Jeans",
                "Retro Revival",
                1099,
                1899.99,
                18,
                "Channel retro vibes with these high-waisted mom jeans from Retro Revival. Featuring a relaxed fit and tapered leg, they offer a vintage-inspired look. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "black", "acid wash", "light wash"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Distressed Boyfriend Jeans",
                "Effortless Cool",
                1199,
                2099.99,
                15,
                "Achieve effortless cool with these distressed boyfriend jeans from Effortless Cool. Featuring a relaxed fit and distressed detailing, they add a laid-back vibe to any outfit. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "light wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Bootcut Jeans",
                "Classic Comfort",
                1099,
                1899.99,
                20,
                "Stay classic and comfortable with these bootcut jeans from Classic Comfort. Made from soft denim fabric with a slight stretch, they offer a flattering fit and timeless style. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "dark wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Flared Jeans",
                "70s Revival",
                1199,
                2099.99,
                18,
                "Step back in time with these flared jeans from 70s Revival. Featuring a retro-inspired flared leg and high-rise fit, they add a touch of vintage charm to your look. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "light wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        // hoodies

        fashionProducts.add(new FashionProduct(
                "Skinny Jeans",
                "Curve Embrace",
                999,
                1699.99,
                20,
                "Flatter your figure with these curve-embracing skinny jeans from Curve Embrace. Made from stretch denim fabric, they offer a comfortable and slimming fit. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "black", "light wash", "medium wash"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "High-Waisted Mom Jeans",
                "Retro Revival",
                1099,
                1899.99,
                18,
                "Channel retro vibes with these high-waisted mom jeans from Retro Revival. Featuring a relaxed fit and tapered leg, they offer a vintage-inspired look. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "black", "acid wash", "light wash"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Distressed Boyfriend Jeans",
                "Effortless Cool",
                1199,
                2099.99,
                15,
                "Achieve effortless cool with these distressed boyfriend jeans from Effortless Cool. Featuring a relaxed fit and distressed detailing, they add a laid-back vibe to any outfit. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "light wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Bootcut Jeans",
                "Classic Comfort",
                1099,
                1899.99,
                20,
                "Stay classic and comfortable with these bootcut jeans from Classic Comfort. Made from soft denim fabric with a slight stretch, they offer a flattering fit and timeless style. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "dark wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        fashionProducts.add(new FashionProduct(
                "Flared Jeans",
                "70s Revival",
                1199,
                2099.99,
                18,
                "Step back in time with these flared jeans from 70s Revival. Featuring a retro-inspired flared leg and high-rise fit, they add a touch of vintage charm to your look. Available in sizes 24, 26, 28, and 30.",
                true,
                "Denim",
                List.of("24", "26", "28", "30"),
                List.of("blue", "light wash", "medium wash", "black"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.jeansCategory));

        // shoes

        fashionProducts.add(new FashionProduct(
                "Canvas Sneakers",
                "Everyday Casual",
                799,
                1299.99,
                40,
                "Complete your casual look with these canvas sneakers from Everyday Casual. Featuring a classic lace-up design and comfortable rubber sole, they're perfect for everyday wear. Available in sizes 5, 6, 7, and 8.",
                true,
                "Canvas",
                List.of("5", "6", "7", "8"),
                List.of("white", "black", "navy blue", "grey"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Slip-On Sneakers",
                "Effortless Style",
                899,
                1499.99,
                35,
                "Achieve effortless style with these slip-on sneakers from Effortless Style. Featuring a slip-on design and cushioned insole, they offer comfort and convenience. Available in sizes 5, 6, 7, and 8.",
                true,
                "Canvas",
                List.of("5", "6", "7", "8"),
                List.of("black", "white", "grey", "navy blue"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Platform Sneakers",
                "Street Chic",
                999,
                1699.99,
                30,
                "Step up your style game with these platform sneakers from Street Chic. Featuring a chunky sole and lace-up design, they add a trendy touch to any outfit. Available in sizes 5, 6, 7, and 8.",
                true,
                "Canvas",
                List.of("5", "6", "7", "8"),
                List.of("white", "black", "pink", "grey"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Athletic Sneakers",
                "Active Lifestyle",
                899,
                1499.99,
                35,
                "Stay comfortable and active with these athletic sneakers from Active Lifestyle. Featuring a supportive design and cushioned midsole, they're perfect for workouts or everyday wear. Available in sizes 5, 6, 7, and 8.",
                true,
                "Mesh",
                List.of("5", "6", "7", "8"),
                List.of("black", "white", "grey", "pink"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.shoesCategory));

        fashionProducts.add(new FashionProduct(
                "Espadrille Flats",
                "Summer Vibes",
                799,
                1299.99,
                40,
                "Get ready for summer with these espadrille flats from Summer Vibes. Featuring a woven sole and canvas upper, they're perfect for beach days or casual outings. Available in sizes 5, 6, 7, and 8.",
                true,
                "Canvas",
                List.of("5", "6", "7", "8"),
                List.of("black", "navy blue", "striped", "natural"),
                AppConstants.casualStyle,
                AppConstants.womensSection,
                AppConstants.shoesCategory));

        // gown
        fashionProducts.add(new FashionProduct(
                "Embroidered Ball Gown",
                "Elegant Enchantment",
                4999,
                8999.99,
                10,
                "Make a stunning entrance with this embroidered ball gown from Elegant Enchantment. Featuring intricate floral embroidery and a full tulle skirt, it exudes timeless elegance. Perfect for formal events or evening soirées. Available in sizes XS, S, M, and L.",
                true,
                "Tulle",
                List.of("xs", "s", "m", "l"),
                List.of("ivory", "champagne", "rose gold"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.gownsCategory));

        fashionProducts.add(new FashionProduct(
                "Off-Shoulder Mermaid Gown",
                "Glamorous Nights",
                5499,
                9999.99,
                8,
                "Dazzle on the dance floor with this off-shoulder mermaid gown from Glamorous Nights. Featuring a fitted bodice and dramatic mermaid silhouette, it's designed to turn heads. Perfect for formal galas or black-tie events. Available in sizes XS, S, M, and L.",
                true,
                "Stretch Satin",
                List.of("xs", "s", "m", "l"),
                List.of("black", "red", "navy blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.gownsCategory));

        fashionProducts.add(new FashionProduct(
                "Sequin Wrap Gown",
                "Sparkling Splendor",
                4599,
                8499.99,
                12,
                "Shine bright in this sequin wrap gown from Sparkling Splendor. Featuring a plunging neckline and shimmering sequin embellishments, it's guaranteed to make a statement. Perfect for glamorous parties or formal occasions. Available in sizes XS, S, M, and L.",
                true,
                "Sequin",
                List.of("xs", "s", "m", "l"),
                List.of("gold", "silver", "rose gold"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.gownsCategory));

        fashionProducts.add(new FashionProduct(
                "Velvet A-Line Gown",
                "Regal Elegance",
                4799,
                8999.99,
                10,
                "Channel regal elegance with this velvet A-line gown from Regal Elegance. Featuring a luxurious velvet fabric and flattering A-line silhouette, it offers sophistication and style. Perfect for formal dinners or special occasions. Available in sizes XS, S, M, and L.",
                true,
                "Velvet",
                List.of("xs", "s", "m", "l"),
                List.of("burgundy", "emerald green", "royal blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.gownsCategory));

        fashionProducts.add(new FashionProduct(
                "Lace Trumpet Gown",
                "Feminine Flair",
                5299,
                9799.99,
                8,
                "Radiate feminine flair with this lace trumpet gown from Feminine Flair. Featuring delicate lace detailing and a flattering trumpet silhouette, it adds romance to any occasion. Perfect for weddings or formal events. Available in sizes XS, S, M, and L.",
                true,
                "Lace",
                List.of("xs", "s", "m", "l"),
                List.of("blush pink", "ivory", "dusty blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.gownsCategory));

        // jumpsuits
        fashionProducts.add(new FashionProduct(
                "Sequin Halter Jumpsuit",
                "Glamorous Nights",
                3999,
                7299.99,
                15,
                "Turn heads in this sequin halter jumpsuit from Glamorous Nights. Featuring a high neck halter and shimmering sequin embellishments, it's perfect for making a statement on the dance floor. Available in sizes XS, S, M, and L.",
                true,
                "Sequin",
                List.of("xs", "s", "m", "l"),
                List.of("gold", "silver", "black"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.jumpSuitsCategory));

        fashionProducts.add(new FashionProduct(
                "Off-Shoulder Ruffle Jumpsuit",
                "Chic Celebration",
                3499,
                6299.99,
                20,
                "Celebrate in style with this off-shoulder ruffle jumpsuit from Chic Celebration. Featuring an off-shoulder neckline and cascading ruffle detail, it combines elegance with modern flair. Available in sizes XS, S, M, and L.",
                true,
                "Polyester Blend",
                List.of("xs", "s", "m", "l"),
                List.of("red", "black", "navy blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.jumpSuitsCategory));

        fashionProducts.add(new FashionProduct(
                "Velvet Wide-Leg Jumpsuit",
                "Vintage Glam",
                3799,
                6899.99,
                18,
                "Step into vintage glamour with this velvet wide-leg jumpsuit from Vintage Glam. Featuring a luxurious velvet fabric and wide-leg silhouette, it's perfect for retro-inspired parties. Available in sizes XS, S, M, and L.",
                true,
                "Velvet",
                List.of("xs", "s", "m", "l"),
                List.of("burgundy", "emerald green", "navy blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.jumpSuitsCategory));

        fashionProducts.add(new FashionProduct(
                "Satin Wrap Jumpsuit",
                "Sophisticated Style",
                3699,
                6699.99,
                22,
                "Elevate your style with this satin wrap jumpsuit from Sophisticated Style. Featuring a wrap front design and sleek satin fabric, it offers sophistication and versatility. Available in sizes XS, S, M, and L.",
                true,
                "Satin",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "champagne"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.jumpSuitsCategory));

        fashionProducts.add(new FashionProduct(
                "Sequin Belted Jumpsuit",
                "Sparkling Chic",
                3899,
                7099.99,
                17,
                "Shimmer and shine in this sequin belted jumpsuit from Sparkling Chic. Featuring a sequin bodice and belted waist, it's both glamorous and flattering. Available in sizes XS, S, M, and L.",
                true,
                "Sequin",
                List.of("xs", "s", "m", "l"),
                List.of("gold", "silver", "black"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.jumpSuitsCategory));

        // cocktail
        fashionProducts.add(new FashionProduct(
                "Embroidered Sheath Dress",
                "Elegant Enchantment",
                2999,
                5499.99,
                25,
                "Make a sophisticated statement with this embroidered sheath dress from Elegant Enchantment. Featuring intricate embroidery and a figure-flattering silhouette, it's perfect for cocktail parties or formal events. Available in sizes XS, S, M, and L.",
                true,
                "Crepe",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "wine red"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.cockTailCategory));

        fashionProducts.add(new FashionProduct(
                "Lace Fit and Flare Dress",
                "Romantic Reverie",
                2799,
                4999.99,
                28,
                "Indulge in romance with this lace fit and flare dress from Romantic Reverie. Featuring delicate lace detailing and a feminine silhouette, it adds charm to any occasion. Available in sizes XS, S, M, and L.",
                true,
                "Lace",
                List.of("xs", "s", "m", "l"),
                List.of("blush pink", "ivory", "navy blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.cockTailCategory));

        fashionProducts.add(new FashionProduct(
                "Sequin Mini Dress",
                "Dazzling Diva",
                3199,
                5799.99,
                23,
                "Turn heads in this sequin mini dress from Dazzling Diva. Featuring all-over sequin embellishments and a flirty mini length, it's perfect for making a statement on the dance floor. Available in sizes XS, S, M, and L.",
                true,
                "Sequin",
                List.of("xs", "s", "m", "l"),
                List.of("gold", "silver", "black"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.cockTailCategory));

        fashionProducts.add(new FashionProduct(
                "Wrap Front Dress",
                "Chic Sophistication",
                2599,
                4699.99,
                30,
                "Achieve chic sophistication with this wrap front dress from Chic Sophistication. Featuring a wrap front design and flattering silhouette, it's perfect for cocktail parties or evenings out. Available in sizes XS, S, M, and L.",
                true,
                "Polyester Blend",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "burgundy"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.cockTailCategory));

        fashionProducts.add(new FashionProduct(
                "Off-Shoulder Bodycon Dress",
                "Sultry Elegance",
                2899,
                5299.99,
                26,
                "Exude sultry elegance with this off-shoulder bodycon dress from Sultry Elegance. Featuring an off-shoulder neckline and curve-hugging silhouette, it's perfect for cocktail parties or date nights. Available in sizes XS, S, M, and L.",
                true,
                "Spandex Blend",
                List.of("xs", "s", "m", "l"),
                List.of("black", "red", "navy blue"),
                AppConstants.partyWearStyle,
                AppConstants.womensSection,
                AppConstants.cockTailCategory));

        // hijab
        fashionProducts.add(new FashionProduct(
                "Jersey Hijab",
                "Modest Elegance",
                299,
                499.99,
                50,
                "Add a touch of elegance to your outfit with this jersey hijab from Modest Elegance. Made from soft and breathable jersey fabric, it drapes beautifully and offers versatile styling options. Available in a range of classic colors.",
                true,
                "Jersey",
                List.of("m"),
                List.of("black", "grey", "navy blue", "burgundy", "olive green", "taupe"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        fashionProducts.add(new FashionProduct(
                "Chiffon Hijab",
                "Graceful Drapes",
                249,
                399.99,
                55,
                "Achieve graceful draping with this chiffon hijab from Graceful Drapes. Crafted from lightweight chiffon fabric, it offers a delicate and ethereal look. Available in a variety of soft pastel shades.",
                true,
                "Chiffon",
                List.of("m"),
                List.of("blush pink", "ivory", "sky blue", "mint green", "peach", "lavender"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        fashionProducts.add(new FashionProduct(
                "Silk Hijab",
                "Luxurious Drapes",
                499,
                799.99,
                40,
                "Indulge in luxurious draping with this silk hijab from Luxurious Drapes. Crafted from premium silk fabric, it offers a smooth and elegant finish. Available in rich jewel tones.",
                true,
                "Silk",
                List.of("m"),
                List.of("emerald green", "ruby red", "sapphire blue", "amethyst purple", "onyx black", "topaz gold"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        fashionProducts.add(new FashionProduct(
                "Lace Trim Hijab",
                "Feminine Details",
                349,
                599.99,
                45,
                "Enhance your look with feminine details in this lace trim hijab. Crafted from soft fabric with delicate lace trim, it adds a touch of elegance to your outfit. Available in a selection of romantic colors.",
                true,
                "Polyester Blend",
                List.of("m"),
                List.of("blush pink", "ivory", "dusty rose", "mauve", "champagne", "lavender"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        fashionProducts.add(new FashionProduct(
                "Printed Hijab",
                "Chic Patterns",
                279,
                449.99,
                60,
                "Make a statement with chic patterns in this printed hijab. Featuring bold prints and vibrant colors, it adds personality to your modest attire. Available in a range of eye-catching designs.",
                true,
                "Viscose",
                List.of("m"),
                List.of("geometric print", "floral print", "abstract print", "animal print", "paisley print",
                        "striped print"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        fashionProducts.add(new FashionProduct(
                "Embroidered Hijab",
                "Timeless Elegance",
                379,
                649.99,
                35,
                "Elevate your modest look with timeless elegance in this embroidered hijab. Featuring intricate embroidery and subtle detailing, it exudes sophistication. Available in a selection of classic shades.",
                true,
                "Cotton Blend",
                List.of("m"),
                List.of("white", "cream", "beige", "taupe", "light grey", "charcoal"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.hijabCategory));

        // abaya

        fashionProducts.add(new FashionProduct(
                "Basic Abaya",
                "Modest Essentials",
                899,
                1599.99,
                25,
                "Stay modest and stylish with this basic abaya from Modest Essentials. Made from comfortable fabric with a loose fit, it's perfect for everyday wear. Available in classic black.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("black"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        fashionProducts.add(new FashionProduct(
                "Kimono Abaya",
                "Effortless Elegance",
                1299,
                2299.99,
                20,
                "Achieve effortless elegance with this kimono-style abaya. Featuring wide sleeves and a relaxed fit, it offers comfort and style in one. Available in a selection of neutral tones.",
                true,
                "Crepe",
                List.of("s", "m", "l", "xl"),
                List.of("taupe", "beige", "grey", "navy blue"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        fashionProducts.add(new FashionProduct(
                "Wrap Abaya",
                "Versatile Style",
                1099,
                1899.99,
                22,
                "Wrap yourself in versatile style with this wrap abaya. Featuring a self-tie belt and flowy silhouette, it offers multiple styling options. Available in a range of muted hues.",
                true,
                "Chiffon",
                List.of("s", "m", "l", "xl"),
                List.of("light grey", "dusty rose", "olive green", "charcoal"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        fashionProducts.add(new FashionProduct(
                "Embroidered Abaya",
                "Intricate Details",
                1499,
                2599.99,
                18,
                "Adorn yourself in intricate details with this embroidered abaya. Featuring delicate embroidery and embellishments, it adds a touch of elegance to your modest look. Available in select pastel shades.",
                true,
                "Cotton Blend",
                List.of("s", "m", "l", "xl"),
                List.of("blush pink", "ivory", "mint green", "lavender"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        fashionProducts.add(new FashionProduct(
                "Lace Trim Abaya",
                "Feminine Charm",
                1199,
                2099.99,
                24,
                "Enhance your modest look with feminine charm in this lace trim abaya. Featuring delicate lace detailing, it exudes sophistication and grace. Available in a range of soft hues.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("rose", "mauve", "taupe", "dusty blue"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        fashionProducts.add(new FashionProduct(
                "Maxi Abaya",
                "Timeless Silhouette",
                1399,
                2399.99,
                21,
                "Opt for a timeless silhouette with this maxi abaya. Featuring a long, flowing design and classic fit, it offers effortless style and modesty. Available in versatile black.",
                true,
                "Polyester",
                List.of("s", "m", "l", "xl"),
                List.of("black"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.abayaCategory));

        // maxi
        fashionProducts.add(new FashionProduct(
                "Floral Print Maxi Dress",
                "Bohemian Beauty",
                1799,
                2999.99,
                30,
                "Channel bohemian beauty in this floral print maxi dress. Featuring a flowy silhouette and romantic prints, it's perfect for casual outings or special occasions. Available in a variety of floral patterns.",
                true,
                "Rayon",
                List.of("xs", "s", "m", "l"),
                List.of("white floral", "blue floral", "pink floral", "green floral"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        fashionProducts.add(new FashionProduct(
                "Tiered Maxi Dress",
                "Effortless Chic",
                1599,
                2699.99,
                35,
                "Achieve effortless chic in this tiered maxi dress. Featuring a tiered design and relaxed fit, it offers comfort and style in one. Available in a range of solid colors.",
                true,
                "Cotton Blend",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "olive green", "taupe"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        fashionProducts.add(new FashionProduct(
                "Pleated Maxi Dress",
                "Elegant Drapes",
                1899,
                3199.99,
                28,
                "Indulge in elegant drapes with this pleated maxi dress. Featuring delicate pleats and a flowing silhouette, it exudes sophistication and grace. Available in select pastel shades.",
                true,
                "Polyester",
                List.of("xs", "s", "m", "l"),
                List.of("blush pink", "ivory", "lavender", "light blue"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        fashionProducts.add(new FashionProduct(
                "Wrap Maxi Dress",
                "Versatile Elegance",
                1699,
                2899.99,
                32,
                "Wrap yourself in versatile elegance with this wrap maxi dress. Featuring a wrap front design and adjustable tie waist, it offers a flattering fit for any body type. Available in a variety of solid colors.",
                true,
                "Viscose",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "burgundy", "olive green"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        fashionProducts.add(new FashionProduct(
                "Embroidered Maxi Dress",
                "Feminine Details",
                2099,
                3599.99,
                26,
                "Add feminine details to your look with this embroidered maxi dress. Featuring intricate embroidery and subtle embellishments, it adds charm and elegance to any occasion. Available in a range of soft hues.",
                true,
                "Chiffon",
                List.of("xs", "s", "m", "l"),
                List.of("blush pink", "ivory", "mint green", "sky blue"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        fashionProducts.add(new FashionProduct(
                "Lace Maxi Dress",
                "Romantic Allure",
                1999,
                3399.99,
                29,
                "Capture romantic allure in this lace maxi dress. Featuring delicate lace detailing and a timeless silhouette, it's perfect for special occasions or evening events. Available in select romantic colors.",
                true,
                "Lace",
                List.of("xs", "s", "m", "l"),
                List.of("blush pink", "ivory", "wine red", "navy blue"),
                AppConstants.modestWearStyle,
                AppConstants.womensSection,
                AppConstants.maxiCategory));

        // jacket
        fashionProducts.add(new FashionProduct(
                "Quilted Puffer Jacket",
                "Urban Chic",
                1999,
                3499.99,
                40,
                "Stay warm and stylish in this quilted puffer jacket. Featuring a sleek design and cozy insulation, it's perfect for cold weather outings. Available in a selection of trendy colors.",
                true,
                "Polyester",
                List.of("xs", "s", "m", "l"),
                List.of("black", "navy blue", "olive green", "burgundy"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Faux Leather Moto Jacket",
                "Rebel Glam",
                2399,
                4199.99,
                35,
                "Channel your inner rebel with this faux leather moto jacket. Featuring edgy hardware and a cropped silhouette, it adds instant attitude to any outfit. Available in classic black.",
                true,
                "Faux Leather",
                List.of("xs", "s", "m", "l"),
                List.of("black"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Denim Jacket",
                "Vintage Cool",
                1699,
                2999.99,
                45,
                "Embrace vintage cool in this classic denim jacket. Featuring distressed detailing and a relaxed fit, it adds a touch of laid-back charm to your look. Available in timeless blue denim.",
                true,
                "Denim",
                List.of("xs", "s", "m", "l"),
                List.of("blue"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Utility Jacket",
                "Casual Utility",
                1799,
                3199.99,
                38,
                "Opt for casual utility with this versatile jacket. Featuring multiple pockets and a drawstring waist, it offers both style and functionality. Available in a selection of earthy tones.",
                true,
                "Cotton Blend",
                List.of("xs", "s", "m", "l"),
                List.of("olive green", "khaki", "taupe", "camel"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Bomber Jacket",
                "Sporty Chic",
                1899,
                3299.99,
                42,
                "Add a sporty edge to your look with this bomber jacket. Featuring ribbed trims and a relaxed fit, it's perfect for casual outings or weekend adventures. Available in a variety of bold colors.",
                true,
                "Polyester",
                List.of("xs", "s", "m", "l"),
                List.of("red", "navy blue", "mustard yellow", "burgundy"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        fashionProducts.add(new FashionProduct(
                "Trench Coat",
                "Timeless Elegance",
                2499,
                4399.99,
                30,
                "Achieve timeless elegance in this classic trench coat. Featuring a double-breasted front and belted waist, it offers a sophisticated silhouette for any occasion. Available in versatile beige.",
                true,
                "Cotton Blend",
                List.of("xs", "s", "m", "l"),
                List.of("beige"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.jacketCategory));

        // coat
        fashionProducts.add(new FashionProduct(
                "Wool Blend Coat",
                "Sophisticated Style",
                2999,
                5299.99,
                25,
                "Elevate your style with this wool blend coat. Featuring a tailored silhouette and classic design, it exudes sophistication and elegance. Available in timeless black.",
                true,
                "Wool Blend",
                List.of("xs", "s", "m", "l"),
                List.of("black"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Faux Fur Coat",
                "Glamorous Glam",
                3499,
                6199.99,
                20,
                "Make a glamorous statement with this faux fur coat. Featuring plush faux fur and a luxe feel, it adds instant elegance to any ensemble. Available in select neutral shades.",
                true,
                "Faux Fur",
                List.of("xs", "s", "m", "l"),
                List.of("taupe", "ivory", "mink", "chocolate"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Quilted Coat",
                "Cozy Comfort",
                2699,
                4799.99,
                22,
                "Stay cozy and stylish in this quilted coat. Featuring diamond quilting and a detachable hood, it's perfect for chilly days. Available in a selection of versatile colors.",
                true,
                "Polyester",
                List.of("xs", "s", "m", "l"),
                List.of("navy blue", "olive green", "burgundy", "charcoal"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Parka Coat",
                "Urban Chic",
                3199,
                5699.99,
                18,
                "Embrace urban chic in this parka coat. Featuring a faux fur-trimmed hood and multiple pockets, it combines style and functionality effortlessly. Available in select muted tones.",
                true,
                "Cotton Blend",
                List.of("xs", "s", "m", "l"),
                List.of("khaki", "grey", "navy blue", "olive green"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Belted Wrap Coat",
                "Effortless Sophistication",
                2899,
                5099.99,
                28,
                "Achieve effortless sophistication in this belted wrap coat. Featuring a draped front and waist-cinching belt, it offers a flattering silhouette for any occasion. Available in a variety of chic colors.",
                true,
                "Wool Blend",
                List.of("xs", "s", "m", "l"),
                List.of("camel", "charcoal", "burgundy", "navy blue"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));

        fashionProducts.add(new FashionProduct(
                "Tweed Coat",
                "Timeless Elegance",
                2799,
                4899.99,
                24,
                "Step into timeless elegance with this tweed coat. Featuring a sophisticated tweed fabric and tailored fit, it exudes classic charm and style. Available in select neutral tones.",
                true,
                "Tweed",
                List.of("xs", "s", "m", "l"),
                List.of("taupe", "charcoal", "camel", "ivory"),
                AppConstants.outWearStyle,
                AppConstants.womensSection,
                AppConstants.coatsCategory));
        
        //kids
        
        //shirts
        fashionProducts.add(new FashionProduct(
        	    "Striped Cotton Shirt",
        	    "Tiny Trends",
        	    699,
        	    1299.99,
        	    50,
        	    "Add a pop of color to your little one's wardrobe with this striped cotton shirt. Made from soft and breathable cotton, it offers comfort and style for everyday wear. Available in vibrant striped patterns.",
        	    true,
        	    "Cotton",
        	    List.of("2t", "3t", "4t", "5t"),
        	    List.of("blue/white stripes", "red/white stripes", "green/white stripes", "yellow/white stripes"),
        	    AppConstants.topWearStyle,
        	    AppConstants.kidsSection,
        	    AppConstants.shirtCategory
        	));

        fashionProducts.add(new FashionProduct(
                "Denim Shirt",
                "Cool Kids Club",
                799,
                1499.99,
                45,
                "Get your little trendsetter ready with this denim shirt. Featuring a classic denim design and button-up front, it adds a touch of cool to any outfit. Available in timeless denim washes.",
                true,
                "Denim",
                List.of("2t", "3t", "4t", "5t"),
                List.of("light blue denim", "dark blue denim"),
                AppConstants.topWearStyle,
                AppConstants.kidsSection,
                AppConstants.shirtCategory));
        	
        fashionProducts.add(new FashionProduct(
                "Printed Oxford Shirt",
                "Smart Style",
                899,
                1699.99,
                42,
                "Dress your little one in smart style with this printed oxford shirt. Featuring a crisp oxford fabric and playful prints, it's perfect for special occasions or family gatherings. Available in a variety of fun prints.",
                true,
                "Cotton",
                List.of("2t", "3t", "4t", "5t"),
                List.of("dinosaur print", "rocket print", "animal print", "stripe print"),
                AppConstants.topWearStyle,
                AppConstants.kidsSection,
                AppConstants.shirtCategory));

		fashionProducts.add(new FashionProduct(
		                "Plaid Flannel Shirt",
		                "Lumberjack Junior",
		                749,
		                1399.99,
		                48,
		                "Keep your little one cozy and stylish with this plaid flannel shirt. Made from soft and warm flannel fabric, it's perfect for outdoor adventures or chilly days. Available in classic plaid patterns.",
		                true,
		                "Flannel",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("red plaid", "blue plaid", "green plaid", "yellow plaid"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Embroidered Chambray Shirt",
		                "Vintage Vibes",
		                849,
		                1599.99,
		                40,
		                "Give your little one a touch of vintage charm with this embroidered chambray shirt. Featuring delicate embroidery and a soft chambray fabric, it adds a sweet and stylish touch to any outfit. Available in select embroidered designs.",
		                true,
		                "Chambray",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("heart embroidery", "flower embroidery", "star embroidery"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shirtCategory));
		
		// tshirts
		fashionProducts.add(new FashionProduct(
		                "Graphic Print T-Shirt",
		                "Cool Kids Club",
		                399,
		                799.99,
		                60,
		                "Let your little one showcase their personality with this graphic print t-shirt. Featuring fun and colorful prints, it adds a playful touch to any outfit. Available in a variety of cool designs.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("dinosaur", "rocket", "unicorn", "superhero"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.tshirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Basic Cotton T-Shirt",
		                "Everyday Essentials",
		                299,
		                599.99,
		                70,
		                "Stock up on everyday essentials with this basic cotton t-shirt. Made from soft and breathable cotton, it offers comfort and versatility for daily wear. Available in a range of classic colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("white", "black", "navy", "grey"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.tshirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Striped Pocket T-Shirt",
		                "Playtime Ready",
		                449,
		                899.99,
		                55,
		                "Get your little one ready for playtime with this striped pocket t-shirt. Featuring stylish stripes and a handy chest pocket, it's both practical and trendy. Available in assorted stripe colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue/white stripes", "red/white stripes", "green/white stripes",
		                                "yellow/white stripes"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.tshirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Printed Character T-Shirt",
		                "Fun Favorites",
		                379,
		                749.99,
		                65,
		                "Let your little one's favorite characters come to life with this printed character t-shirt. Featuring beloved characters and vibrant prints, it's sure to be a hit. Available in a range of popular character designs.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("cartoon character", "superhero", "animal", "princess"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.tshirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Tie-Dye T-Shirt",
		                "Groovy Vibes",
		                429,
		                849.99,
		                52,
		                "Add some groovy vibes to your little one's wardrobe with this tie-dye t-shirt. Featuring bold and colorful tie-dye patterns, it's perfect for expressing their unique style. Available in assorted tie-dye designs.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("rainbow tie-dye", "pastel tie-dye", "neon tie-dye", "earth tone tie-dye"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.tshirtCategory));
		
		// sweatshirts
		fashionProducts.add(new FashionProduct(
		                "Fleece Hoodie",
		                "Cozy Comfort",
		                699,
		                1299.99,
		                45,
		                "Keep your little one cozy and warm with this fleece hoodie. Made from soft and plush fleece fabric, it's perfect for chilly days or outdoor adventures. Available in a selection of vibrant colors.",
		                true,
		                "Fleece",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("red", "blue", "green", "yellow"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.sweatShirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Graphic Print Sweatshirt",
		                "Playful Prints",
		                549,
		                1049.99,
		                50,
		                "Add some fun to your little one's wardrobe with this graphic print sweatshirt. Featuring playful prints and cozy fleece lining, it's perfect for everyday play. Available in a variety of cute designs.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("animal print", "dinosaur print", "space print", "rainbow print"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.sweatShirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Zip-Up Hoodie",
		                "Sporty Style",
		                649,
		                1199.99,
		                48,
		                "Get your little athlete ready for action with this zip-up hoodie. Featuring sporty stripes and a convenient zip closure, it's both stylish and practical. Available in assorted stripe colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue/white stripes", "red/white stripes", "green/white stripes",
		                                "yellow/white stripes"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.sweatShirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Sherpa Pullover",
		                "Mountain Explorer",
		                799,
		                1499.99,
		                40,
		                "Embrace outdoor adventures with this sherpa pullover. Made from cozy sherpa fleece and featuring a half-zip front, it's perfect for chilly hikes or camping trips. Available in a selection of nature-inspired colors.",
		                true,
		                "Sherpa Fleece",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("forest green", "mountain blue", "alpine white", "rocky grey"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.sweatShirtCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Colorblock Sweatshirt",
		                "Playground Cool",
		                599,
		                1149.99,
		                46,
		                "Keep your little one looking cool on the playground with this colorblock sweatshirt. Featuring bold colorblocking and a comfortable fit, it's sure to be a playground favorite. Available in assorted colorblock combinations.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue/green", "red/yellow", "purple/pink", "orange/blue"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.sweatShirtCategory));
		
		// coats
		fashionProducts.add(new FashionProduct(
		                "Quilted Puffer Coat",
		                "Cozy Kids",
		                1299,
		                2399.99,
		                30,
		                "Keep your little one warm and stylish with this quilted puffer coat. Featuring a cozy quilted design and insulated filling, it's perfect for cold winter days. Available in a range of fun colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("red", "blue", "green", "yellow"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.coatsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Fleece-Lined Parka",
		                "Winter Explorer",
		                1499,
		                2799.99,
		                25,
		                "Get ready for winter adventures with this fleece-lined parka. Featuring a durable outer shell and cozy fleece lining, it offers warmth and protection against the elements. Available in select outdoor-inspired colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("navy", "olive green", "charcoal", "burgundy"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.coatsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Hooded Raincoat",
		                "Rainy Day Fun",
		                999,
		                1899.99,
		                35,
		                "Stay dry and stylish on rainy days with this hooded raincoat. Made from waterproof material and featuring a protective hood, it's perfect for outdoor play. Available in a variety of bright colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("pink", "blue", "yellow", "green"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.coatsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Faux Fur Coat",
		                "Chic and Cozy",
		                1699,
		                3199.99,
		                20,
		                "Add a touch of luxury to your little one's wardrobe with this faux fur coat. Featuring a plush faux fur exterior and satin lining, it's perfect for special occasions or dress-up play. Available in select classic colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("black", "white", "brown", "grey"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.coatsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Toggle Button Coat",
		                "Vintage Vibes",
		                1399,
		                2599.99,
		                28,
		                "Get a dose of vintage charm with this toggle button coat. Featuring classic toggle closures and a cozy hood, it adds timeless style to any outfit. Available in a range of heritage-inspired colors.",
		                true,
		                "Wool Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("camel", "navy", "burgundy", "charcoal"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.coatsCategory));
		
		// hoodies
		fashionProducts.add(new FashionProduct(
		                "Graphic Print Hoodie",
		                "Playtime Favorites",
		                699,
		                1299.99,
		                40,
		                "Let your little one's imagination run wild with this graphic print hoodie. Featuring fun and colorful prints, it's perfect for playtime adventures. Available in a variety of playful designs.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("dinosaur", "unicorn", "rocket", "animal"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.hoodiesCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Zip-Up Fleece Hoodie",
		                "Cozy Comfort",
		                799,
		                1499.99,
		                35,
		                "Keep your little one warm and cozy with this zip-up fleece hoodie. Made from soft and plush fleece fabric, it's perfect for chilly days or lounging at home. Available in assorted colors.",
		                true,
		                "Fleece",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue", "red", "green", "grey"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.hoodiesCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Striped Pullover Hoodie",
		                "Sporty Style",
		                749,
		                1399.99,
		                38,
		                "Get your little athlete ready for action with this striped pullover hoodie. Featuring sporty stripes and a cozy hood, it's perfect for active play. Available in assorted stripe colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue/white stripes", "red/white stripes", "green/white stripes",
		                                "yellow/white stripes"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.hoodiesCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Colorblock Hoodie",
		                "Playground Cool",
		                749,
		                1399.99,
		                42,
		                "Keep your little one looking cool on the playground with this colorblock hoodie. Featuring bold colorblocking and a comfortable fit, it's sure to be a playground favorite. Available in assorted colorblock combinations.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue/green", "red/yellow", "purple/pink", "orange/blue"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.hoodiesCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Sherpa-Lined Hoodie",
		                "Winter Ready",
		                899,
		                1699.99,
		                30,
		                "Prepare your little one for winter adventures with this sherpa-lined hoodie. Featuring cozy sherpa lining and a zip-up front, it offers warmth and comfort for chilly days. Available in select winter-inspired colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("forest green", "mountain blue", "alpine white", "rocky grey"),
		                AppConstants.topWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.hoodiesCategory));
		
		// jeans
		fashionProducts.add(new FashionProduct(
		                "Classic Denim Jeans",
		                "Cool Kids",
		                799,
		                1499.99,
		                50,
		                "Get your little one ready for adventure with these classic denim jeans. Made from durable denim fabric, they're perfect for everyday wear. Available in a range of washes and styles.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue", "black", "grey", "indigo"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.jeansCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Distressed Skinny Jeans",
		                "Urban Style",
		                899,
		                1699.99,
		                45,
		                "Add some edge to your little one's wardrobe with these distressed skinny jeans. Featuring a trendy distressed finish and slim fit, they're perfect for stylish kids. Available in select distressed washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("light wash", "medium wash", "dark wash"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.jeansCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Slim Fit Jeans",
		                "Street Style",
		                849,
		                1599.99,
		                48,
		                "Give your little trendsetter a dose of street style with these slim fit jeans. Featuring a modern slim fit and classic denim construction, they're perfect for everyday wear. Available in a variety of washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("black", "blue", "grey", "charcoal"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.jeansCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Embroidered Denim Jeans",
		                "Boho Chic",
		                899,
		                1699.99,
		                42,
		                "Add a touch of boho chic to your little one's wardrobe with these embroidered denim jeans. Featuring intricate embroidery and a comfortable fit, they're perfect for free-spirited kids. Available in select denim washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("light wash", "medium wash", "dark wash"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.jeansCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Cargo Jeans",
		                "Adventure Ready",
		                899,
		                1699.99,
		                40,
		                "Get your little explorer ready for adventure with these cargo jeans. Featuring plenty of pockets and a durable denim construction, they're perfect for outdoor play. Available in select denim washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue", "grey", "black", "charcoal"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.jeansCategory));
		
		// pants
		fashionProducts.add(new FashionProduct(
		                "Cotton Chino Pants",
		                "Preppy Style",
		                749,
		                1399.99,
		                55,
		                "Add a touch of preppy style to your little one's wardrobe with these cotton chino pants. Made from soft and breathable cotton, they're perfect for both casual and dressy occasions. Available in a variety of classic colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("khaki", "navy", "olive", "grey"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.pantCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Cargo Pants",
		                "Outdoor Explorer",
		                799,
		                1499.99,
		                50,
		                "Gear up for outdoor adventures with these cargo pants. Featuring plenty of pockets and durable construction, they're perfect for little explorers. Available in select outdoor-inspired colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("green", "brown", "camo", "charcoal"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.pantCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Slim Fit Jogger Pants",
		                "Sporty Style",
		                749,
		                1399.99,
		                45,
		                "Keep your little athlete comfortable and stylish with these slim fit jogger pants. Featuring a modern slim fit and elasticized cuffs, they're perfect for active play. Available in a variety of sporty colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("black", "navy", "grey", "blue"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.pantCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Fleece-Lined Cargo Pants",
		                "Winter Warmth",
		                899,
		                1699.99,
		                40,
		                "Stay warm and cozy during winter adventures with these fleece-lined cargo pants. Featuring a soft fleece lining and plenty of pockets, they're perfect for cold weather play. Available in select outdoor-inspired colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("brown", "olive", "charcoal", "navy"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.pantCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Stretch Twill Pants",
		                "Casual Comfort",
		                749,
		                1399.99,
		                48,
		                "Keep your little one comfortable and stylish with these stretch twill pants. Made from soft and stretchy twill fabric, they're perfect for everyday wear. Available in a variety of versatile colors.",
		                true,
		                "Twill",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("navy", "khaki", "grey", "black"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.pantCategory));
		
		// chinos
		fashionProducts.add(new FashionProduct(
		                "Cotton Chino Pants",
		                "Preppy Style",
		                749,
		                1399.99,
		                55,
		                "Add a touch of preppy style to your little one's wardrobe with these cotton chino pants. Made from soft and breathable cotton, they're perfect for both casual and dressy occasions. Available in a variety of classic colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("khaki", "navy", "olive", "grey"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.chinosCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Slim Fit Chino Pants",
		                "Modern Trendsetter",
		                799,
		                1499.99,
		                50,
		                "Get your little trendsetter ready for the runway with these slim fit chino pants. Featuring a modern slim fit and stylish design, they're perfect for fashion-forward kids. Available in a variety of on-trend colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("charcoal", "olive", "navy", "burgundy"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.chinosCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Khaki Chino Pants",
		                "Classic Comfort",
		                749,
		                1399.99,
		                48,
		                "Keep your little one comfortable and stylish with these khaki chino pants. Made from soft and durable cotton, they're perfect for everyday wear. Available in a variety of classic colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("khaki", "stone", "tan", "camel"),
		                AppConstants.casualStyle,
		                AppConstants.kidsSection,
		                AppConstants.chinosCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Cargo Chino Pants",
		                "Adventure Ready",
		                799,
		                1499.99,
		                45,
		                "Gear up for outdoor adventures with these cargo chino pants. Featuring plenty of pockets and durable construction, they're perfect for little explorers. Available in select outdoor-inspired colors.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("olive", "camo", "navy", "charcoal"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.chinosCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Stretch Twill Chinos",
		                "Casual Cool",
		                749,
		                1399.99,
		                48,
		                "Keep your little one looking cool and feeling comfortable with these stretch twill chinos. Made from soft and stretchy twill fabric, they're perfect for everyday wear. Available in a variety of versatile colors.",
		                true,
		                "Twill",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("navy", "khaki", "grey", "black"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.chinosCategory));
		
		// shorts
		fashionProducts.add(new FashionProduct(
		                "Cargo Shorts",
		                "Adventure Ready",
		                499,
		                999.99,
		                40,
		                "Get your little explorer ready for adventure with these cargo shorts. Featuring plenty of pockets and durable construction, they're perfect for outdoor play. Available in a variety of fun colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue", "green", "khaki", "orange"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Denim Shorts",
		                "Casual Cool",
		                449,
		                899.99,
		                35,
		                "Keep your little one looking cool and feeling comfortable with these denim shorts. Made from soft and durable denim, they're perfect for everyday wear. Available in a variety of washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("light wash", "medium wash", "dark wash"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Sports Shorts",
		                "Active Lifestyle",
		                399,
		                799.99,
		                30,
		                "Encourage an active lifestyle with these sports shorts. Made from breathable fabric and featuring an elastic waistband, they're perfect for sports and play. Available in a variety of vibrant colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("red", "blue", "green", "yellow"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Printed Shorts",
		                "Fun and Playful",
		                399,
		                799.99,
		                25,
		                "Add a pop of fun to your little one's wardrobe with these printed shorts. Featuring playful prints and a comfortable fit, they're perfect for playdates and adventures. Available in a variety of cute designs.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("stripes", "dots", "animals", "stars"),
		                AppConstants.bottomWearStyle,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		// diaper
		fashionProducts.add(new FashionProduct(
		                "Ultra-Soft Diapers",
		                "Baby Comfort",
		                499,
		                999.99,
		                100,
		                "Keep your little one dry and comfortable with these ultra-soft diapers. Featuring a breathable design and absorbent core, they provide long-lasting protection. Available in multiple sizes for a perfect fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Hypoallergenic Diapers",
		                "Sensitive Skin",
		                549,
		                1099.99,
		                95,
		                "Protect your baby's delicate skin with these hypoallergenic diapers. Made from gentle materials and free from harmful chemicals, they're perfect for sensitive skin. Available in multiple sizes for a comfortable fit.",
		                true,
		                "Organic Cotton",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Premium Overnight Diapers",
		                "Nighttime Protection",
		                599,
		                1199.99,
		                90,
		                "Ensure a good night's sleep for your little one with these premium overnight diapers. Featuring extra absorbency and leak protection, they're perfect for nighttime use. Available in multiple sizes for a snug fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Diapers with Wetness Indicator",
		                "Parent's Choice",
		                549,
		                1099.99,
		                85,
		                "Make diaper changes easier with these diapers featuring a wetness indicator. Designed to let you know when it's time for a change, they provide convenience and peace of mind. Available in multiple sizes for a secure fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Biodegradable Diapers",
		                "Eco-Friendly Choice",
		                599,
		                1199.99,
		                80,
		                "Go green with these biodegradable diapers. Made from eco-friendly materials, they're gentle on your baby's skin and the environment. Available in multiple sizes for a comfortable fit.",
		                true,
		                "Bamboo Fiber",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		// balnket
		fashionProducts.add(new FashionProduct(
		                "Cargo Shorts",
		                "Adventure Ready",
		                499,
		                999.99,
		                40,
		                "Get your little explorer ready for adventure with these cargo shorts. Featuring plenty of pockets and durable construction, they're perfect for outdoor play. Available in a variety of fun colors.",
		                true,
		                "Cotton",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("blue", "green", "khaki", "orange"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Denim Shorts",
		                "Casual Cool",
		                449,
		                899.99,
		                35,
		                "Keep your little one looking cool and feeling comfortable with these denim shorts. Made from soft and durable denim, they're perfect for everyday wear. Available in a variety of washes.",
		                true,
		                "Denim",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("light wash", "medium wash", "dark wash"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Sports Shorts",
		                "Active Lifestyle",
		                399,
		                799.99,
		                30,
		                "Encourage an active lifestyle with these sports shorts. Made from breathable fabric and featuring an elastic waistband, they're perfect for sports and play. Available in a variety of vibrant colors.",
		                true,
		                "Polyester",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("red", "blue", "green", "yellow"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Printed Shorts",
		                "Fun and Playful",
		                399,
		                799.99,
		                25,
		                "Add a pop of fun to your little one's wardrobe with these printed shorts. Featuring playful prints and a comfortable fit, they're perfect for playdates and adventures. Available in a variety of cute designs.",
		                true,
		                "Cotton Blend",
		                List.of("2t", "3t", "4t", "5t"),
		                List.of("stripes", "dots", "animals", "stars"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.shortsCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Ultra-Soft Diapers",
		                "Baby Comfort",
		                499,
		                999.99,
		                100,
		                "Keep your little one dry and comfortable with these ultra-soft diapers. Featuring a breathable design and absorbent core, they provide long-lasting protection. Available in multiple sizes for a perfect fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Hypoallergenic Diapers",
		                "Sensitive Skin",
		                549,
		                1099.99,
		                95,
		                "Protect your baby's delicate skin with these hypoallergenic diapers. Made from gentle materials and free from harmful chemicals, they're perfect for sensitive skin. Available in multiple sizes for a comfortable fit.",
		                true,
		                "Organic Cotton",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Premium Overnight Diapers",
		                "Nighttime Protection",
		                599,
		                1199.99,
		                90,
		                "Ensure a good night's sleep for your little one with these premium overnight diapers. Featuring extra absorbency and leak protection, they're perfect for nighttime use. Available in multiple sizes for a snug fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Diapers with Wetness Indicator",
		                "Parent's Choice",
		                549,
		                1099.99,
		                85,
		                "Make diaper changes easier with these diapers featuring a wetness indicator. Designed to let you know when it's time for a change, they provide convenience and peace of mind. Available in multiple sizes for a secure fit.",
		                true,
		                "Cotton Blend",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Biodegradable Diapers",
		                "Eco-Friendly Choice",
		                599,
		                1199.99,
		                80,
		                "Go green with these biodegradable diapers. Made from eco-friendly materials, they're gentle on your baby's skin and the environment. Available in multiple sizes for a comfortable fit.",
		                true,
		                "Bamboo Fiber",
		                List.of("s", "m", "l", "xl"),
		                List.of("white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.diaperCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Ultra-Soft Baby Blanket",
		                "Cozy Comfort",
		                799,
		                1599.99,
		                60,
		                "Wrap your little one in cozy comfort with this ultra-soft baby blanket. Made from plush fabric, it's perfect for snuggling and naptime. Available in a variety of adorable prints and colors.",
		                true,
		                "Polyester",
		                List.of("one size"),
		                List.of("blue", "pink", "grey", "cream"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.blanketCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Knit Baby Blanket",
		                "Classic Style",
		                699,
		                1399.99,
		                55,
		                "Add a touch of classic style to your nursery with this knit baby blanket. Made from soft and breathable cotton, it's perfect for swaddling and cuddling. Available in a variety of timeless designs.",
		                true,
		                "Cotton",
		                List.of("one size"),
		                List.of("stripes", "dots", "animals", "hearts"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.blanketCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Sherpa-Lined Baby Blanket",
		                "Warm and Cozy",
		                899,
		                1799.99,
		                50,
		                "Keep your little one warm and cozy with this sherpa-lined baby blanket. Featuring a plush sherpa lining and a soft outer layer, it's perfect for chilly nights. Available in a variety of charming colors.",
		                true,
		                "Polyester",
		                List.of("one size"),
		                List.of("blue", "pink", "grey", "white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.blanketCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Organic Cotton Baby Blanket",
		                "Natural Comfort",
		                849,
		                1699.99,
		                45,
		                "Give your baby the gift of natural comfort with this organic cotton baby blanket. Made from 100% organic cotton, it's gentle on your baby's delicate skin and the planet. Available in a variety of earthy tones.",
		                true,
		                "Organic Cotton",
		                List.of("one size"),
		                List.of("beige", "green", "yellow", "brown"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.blanketCategory));
		
		fashionProducts.add(new FashionProduct(
		                "Personalized Baby Blanket",
		                "Custom Keepsake",
		                999,
		                1999.99,
		                40,
		                "Create a special keepsake for your little one with this personalized baby blanket. Made from soft and cozy fabric, it's perfect for snuggling and naptime. Add your baby's name for a unique touch.",
		                true,
		                "Polyester",
		                List.of("one size"),
		                List.of("blue", "pink", "grey", "white"),
		                AppConstants.babyCare,
		                AppConstants.kidsSection,
		                AppConstants.blanketCategory));

    }
	
	
    @Override
	public Product create(Product product) {
		FashionProduct p = (FashionProduct)product;
		fashionProducts.add(p);
		return p;
	}

	@Override
	public Product delete(Product product) {
		return null;
	}

	@Override
	public Product update(Product product) {
		return null;
		
	}

	@Override
	public Product findById(int id) {
		Product p = null;
		try {
			p = fashionProducts.get(id);
		}catch(IndexOutOfBoundsException ex) {
			System.err.println("Product Not Found!");
		}
		return p;
	}

	@Override
	public Product findByName(String name) {
		Product p = null;
		for(int i=0;i<fashionProducts.size();i++) {
			Product temp = fashionProducts.get(i);
			if(temp.getName().equals(name)) {
				p = temp;
			}
		}
		return p;
	}
	
	public List<FashionProduct> getAllProducts(){
		return fashionProducts;
	}

	public List<FashionProduct> findProductsByCategorySectionAndStyle(String cat, String style, String section) {
		List<FashionProduct> res = new ArrayList<>();
		
		for(FashionProduct p: fashionProducts) {
			if(p.getCategory().equals(cat) && p.getStyle().equals(style) && p.getSection().equals(section)) {
				res.add(p);
			}
		}
		return res;
		
	}
	
}
