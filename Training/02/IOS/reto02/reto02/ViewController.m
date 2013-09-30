//
//  ViewController.m
//  reto02
//
//  Created by carlos on 9/28/13.
//  Copyright (c) 2013 carlos. All rights reserved.
//

#import "ViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)pushButton:(id)sender {
    //self.label.text = @"Button pushed";
    self.label.text = [NSString stringWithFormat:@"%@, %@ %@", NSLocalizedString(@"Hello", @"hello"), self.nameText.text, self.surnameText.text];
}

- (IBAction)hiddeKeyboard:(id)sender
{
    [sender resignFirstResponder];
}

@end
